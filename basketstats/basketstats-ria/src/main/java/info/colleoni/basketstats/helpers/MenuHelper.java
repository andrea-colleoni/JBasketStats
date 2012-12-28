package info.colleoni.basketstats.helpers;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Panel;

/**
 * The Class MenuHelper.
 */
public class MenuHelper {

	/** The tenant helper. */
	@Autowired
	private TenantHelper tenantHelper;
	
	/** The destination container. */
	private ComponentContainer destinationContainer;

	/**
	 * Main menu.
	 * 
	 * @return the accordion
	 */
	public Panel getMainMenu() {
		Accordion mainMenu = new Accordion();
		mainMenu.setSizeFull();

		// Add the components as tabs in the Accordion.
		mainMenu.addTab(getAdministrationMenu(),
				"Administration", null);
		mainMenu.addTab(getProfileMenu(), "Profile", null);
		mainMenu.addTab(getChampionshipMenu(),
				"Championships", null);
		mainMenu.addTab(getTeamMenu(), "Teams", null);
		mainMenu.addTab(getPlayerMenu(), "Players", null);

		// A container for the Accordion.
		Panel panel = new Panel("Main menu");
		panel.setSizeFull();
		panel.addComponent(mainMenu);

		// Trim its layout to allow the Accordion take all space.
		panel.getContent().setSizeFull();
		((Layout) panel.getContent()).setMargin(false);

		return panel;
	}

	/**
	 * Gets the administration menu.
	 *
	 * @return the administration menu
	 */
	public Panel getAdministrationMenu() {
		Button b1 = new Button("Tenant list");
		b1.setWidth(100, Sizeable.UNITS_PERCENTAGE);

		b1.addListener(Button.ClickEvent.class, this,
                "tenantListClick");

		Panel panel = new Panel();
		panel.setSizeFull();
		panel.getContent().setSizeFull();
		((Layout) panel.getContent()).setMargin(false);

		panel.addComponent(b1);

		return panel;
	}

	/**
	 * Gets the profile menu.
	 *
	 * @return the profile menu
	 */
	public Panel getProfileMenu() {
		Button b1 = new Button("Modify current profile");
		b1.setWidth(100, Sizeable.UNITS_PERCENTAGE);

		Panel panel = new Panel();
		panel.setSizeFull();
		panel.getContent().setSizeFull();
		((Layout) panel.getContent()).setMargin(false);

		panel.addComponent(b1);

		return panel;
	}

	/**
	 * Gets the championship menu.
	 *
	 * @return the championship menu
	 */
	public Panel getChampionshipMenu() {
		Button b1 = new Button("Championship list");
		b1.setWidth(100, Sizeable.UNITS_PERCENTAGE);

		Panel panel = new Panel();
		panel.setSizeFull();
		panel.getContent().setSizeFull();
		((Layout) panel.getContent()).setMargin(false);

		panel.addComponent(b1);

		return panel;
	}

	/**
	 * Gets the team menu.
	 *
	 * @return the team menu
	 */
	public Panel getTeamMenu() {
		Button b1 = new Button("Team list");
		b1.setWidth(100, Sizeable.UNITS_PERCENTAGE);

		Panel panel = new Panel();
		panel.setSizeFull();
		panel.getContent().setSizeFull();
		((Layout) panel.getContent()).setMargin(false);

		panel.addComponent(b1);

		return panel;
	}

	/**
	 * Gets the player menu.
	 *
	 * @return the player menu
	 */
	public Panel getPlayerMenu() {
		Button b1 = new Button("Pleyer list");
		b1.setWidth(100, Sizeable.UNITS_PERCENTAGE);

		Panel panel = new Panel();
		panel.setSizeFull();
		panel.getContent().setSizeFull();
		((Layout) panel.getContent()).setMargin(false);

		panel.addComponent(b1);

		return panel;
	}

	/**
	 * Tenant list click.
	 *
	 * @param event the event
	 */
	public void tenantListClick(ClickEvent event) {
		destinationContainer.removeAllComponents();
		destinationContainer.addComponent(tenantHelper.list());
	}

	/**
	 * Gets the destination container.
	 *
	 * @return the destinationContainer
	 */
	public ComponentContainer getDestinationContainer() {
		return destinationContainer;
	}

	/**
	 * Sets the destination container.
	 *
	 * @param destinationContainer the destinationContainer to set
	 */
	public void setDestinationContainer(ComponentContainer destinationContainer) {
		this.destinationContainer = destinationContainer;
	}
}
