/**
 * 
 */
package info.colleoni.basketstats.domain;

/**
 * The Class Season.
 *
 * @author andrea.colleoni
 */
public final class Season {
	
	/** The id. */
	private int id;
	
	/** The tenant id. */
	private int tenantId;
	
	/** The tenant. */
	private Tenant tenant;
	
	/** The start year. */
	private int startYear;
	
	/** The end year. */
	private int endYear;
	
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
	 * Gets the tenant.
	 *
	 * @return the tenant
	 */
	public Tenant getTenant() {
		return tenant;
	}
	
	/**
	 * Sets the tenant.
	 *
	 * @param tenant the tenant to set
	 */
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	
	/**
	 * Gets the start year.
	 *
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}
	
	/**
	 * Sets the start year.
	 *
	 * @param startYear the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	
	/**
	 * Gets the end year.
	 *
	 * @return the endYear
	 */
	public int getEndYear() {
		return endYear;
	}
	
	/**
	 * Sets the end year.
	 *
	 * @param endYear the endYear to set
	 */
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
}
