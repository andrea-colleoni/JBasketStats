/**
 * 
 */
package info.colleoni.basketstats.domain;

/**
 * The Class Championship.
 *
 * @author andrea.colleoni
 */
public final class Championship {
	
	/** The tenant id. */
	private int tenantId;
	
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
}
