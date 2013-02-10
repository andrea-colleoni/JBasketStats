/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;

/**
 * The Class Championship.
 *
 * @author andrea.colleoni
 */
public final class Championship implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2762329404106381229L;

	/** The id. */
	private int id;
	
	/** The tenant id. */
	private int tenantId;
	
	/** The division. */
	private String division;
	
	/** The tenant. */
	private Tenant tenant;
	
	/** The season id. */
	private int seasonId;
	
	/** The season. */
	private Season season;
	
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
	 * Gets the season id.
	 *
	 * @return the seasonId
	 */
	public int getSeasonId() {
		return seasonId;
	}
	
	/**
	 * Sets the season id.
	 *
	 * @param seasonId the seasonId to set
	 */
	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}
	
	/**
	 * Gets the season.
	 *
	 * @return the season
	 */
	public Season getSeason() {
		return season;
	}
	
	/**
	 * Sets the season.
	 *
	 * @param season the season to set
	 */
	public void setSeason(Season season) {
		this.season = season;
	}

	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}

	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		this.division = division;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
