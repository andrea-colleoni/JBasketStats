package info.colleoni.basketstats.domain;

import java.io.Serializable;

/**
 * The Class Tenant.
 */
public class Tenant implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 213688285947878140L;
	
	/** The id. */
	private int id;
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The site admin. */
	private boolean siteAdmin;

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
	 * Sets the name.
	 *
	 * @param value the new name
	 */
	public void setName(final String value) {
		// Automatically generated method. Please do not modify this code.
		this.name = value;
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
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the siteAdmin
	 */
	public boolean isSiteAdmin() {
		return siteAdmin;
	}

	/**
	 * @param siteAdmin the siteAdmin to set
	 */
	public void setSiteAdmin(boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

}
