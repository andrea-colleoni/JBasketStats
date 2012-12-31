package info.colleoni.basketstats.helpers;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

public class TenantHelper {
	
	@Autowired
	private TenantService tenantService;
	
	public Table list() {
		Table table = new Table("Tenants list");
		table.setSelectable(true);
		table.setImmediate(true);
		table.addListener(ValueChangeListener.class, this,
                "tenantSelectClick");
		table.setSizeFull();
		
		table.addContainerProperty("name", String.class,  null);
		table.addContainerProperty("description", String.class,  null);
		table.addContainerProperty("siteAdmin", Boolean.class,  null);
		
		table.setColumnHeader("name", "Name");
		table.setColumnHeader("description", "Description");
		table.setColumnHeader("siteAdmin", "Administrator");
		
		for(Tenant t : tenantService.all()) {
			table.addItem(new Object[] { t.getName(), t.getDescription(), t.isSiteAdmin() }, t.getId());
		}
		return table;
	}
	
	public void tenantSelectClick(ClickEvent event) {
		System.out.println(event);
	}	
	
	public Form item(int tenantId) {
		Form form = new Form();
		Tenant t = tenantService.get(tenantId);
		form.setData(t);
		form.setSizeFull();
		
		form.addField("name", new TextField("Name"));
		form.addField("description", new TextField("Tenant Name"));
		form.addField("siteAdmin", new CheckBox("Site Admin"));
		
        HorizontalLayout footer = new HorizontalLayout();
        footer.setSpacing(true);
        footer.addComponent(new Button("Save"));
        footer.addComponent(new Button("Cancel"));
        form.setFooter(footer);
        
		return form;
	}	
}
