package info.colleoni.basketstats.domain;

import java.io.Serializable;

/**
 * The Class Tenant.
 */
public final class Tenant implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 213688285947878140L;

	/** The description. */
	private String description;
	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/** The site admin. */
	private boolean siteAdmin;

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		// Automatically generated method. Please do not modify this code.
		return this.name;
	}

	/**
	 * Checks if is site admin.
	 *
	 * @return the siteAdmin
	 */
	public boolean isSiteAdmin() {
		return siteAdmin;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Sets the name.
	 * 
	 * @param value
	 *            the new name
	 */
	public void setName(final String value) {
		// Automatically generated method. Please do not modify this code.
		this.name = value;
	}

	/**
	 * Sets the site admin.
	 *
	 * @param siteAdmin the siteAdmin to set
	 */
	public void setSiteAdmin(boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

}
