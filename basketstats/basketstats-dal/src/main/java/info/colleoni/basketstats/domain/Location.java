/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;

/**
 * The Class Location.
 *
 * @author andrea.colleoni
 */
public final class Location extends ElementType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3575939924010904207L;

	/** The tenant id. */
	private int tenantId;
	
	/** The tenant. */
	private Tenant tenant;
	
	/** The location type id. */
	private int locationTypeId;
	
	/** The location type. */
	private LocationType locationType;
	
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
	 * Gets the location type id.
	 *
	 * @return the locationTypeId
	 */
	public int getLocationTypeId() {
		return locationTypeId;
	}
	
	/**
	 * Sets the location type id.
	 *
	 * @param locationTypeId the locationTypeId to set
	 */
	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
	}
	
	/**
	 * Gets the location type.
	 *
	 * @return the locationType
	 */
	public LocationType getLocationType() {
		return locationType;
	}
	
	/**
	 * Sets the location type.
	 *
	 * @param locationType the locationType to set
	 */
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
}
