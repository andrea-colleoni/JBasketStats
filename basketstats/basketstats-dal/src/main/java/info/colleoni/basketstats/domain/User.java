/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.util.Date;

/**
 * The Class User.
 *
 * @author andrea.colleoni
 */
public class User {
	
	/** The id. */
	private int id;
	
	/** The tenant id. */
	private int tenantId;
	
	/** The tenata. */
	private Tenant tenata;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The active. */
	private boolean active;
	
	/** The subscription date. */
	private Date subscriptionDate;
	
	/** The tenant admin. */
	private boolean tenantAdmin;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the tenant id.
	 *
	 * @return the tenantId
	 */
	public int getTenantId() {
		return tenantId;
	}
	
	/**
	 * Sets the tenant id.
	 *
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	
	/**
	 * Gets the tenata.
	 *
	 * @return the tenata
	 */
	public Tenant getTenata() {
		return tenata;
	}
	
	/**
	 * Sets the tenata.
	 *
	 * @param tenata the tenata to set
	 */
	public void setTenata(Tenant tenata) {
		this.tenata = tenata;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Checks if is active.
	 *
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	
	/**
	 * Sets the active.
	 *
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	/**
	 * Gets the subscription date.
	 *
	 * @return the subscriptionDate
	 */
	public Date getSubscriptionDate() {
		return subscriptionDate;
	}
	
	/**
	 * Sets the subscription date.
	 *
	 * @param subscriptionDate the subscriptionDate to set
	 */
	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	
	/**
	 * Checks if is tenant admin.
	 *
	 * @return the tenantAdmin
	 */
	public boolean isTenantAdmin() {
		return tenantAdmin;
	}
	
	/**
	 * Sets the tenant admin.
	 *
	 * @param tenantAdmin the tenantAdmin to set
	 */
	public void setTenantAdmin(boolean tenantAdmin) {
		this.tenantAdmin = tenantAdmin;
	}
}
