package info.colleoni.basketstats.helpers;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.ui.Table;

public class TenantHelper {
	
	@Autowired
	private TenantService tenantService;
	
	public Table list() {
		Table table = new Table("Tenants list");
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
}
