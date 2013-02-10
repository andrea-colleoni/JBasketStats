/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;
import java.util.List;

/**
 * The Class Organization.
 *
 * @author andrea.colleoni
 */
public final class Organization extends ElementType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7033871481016192842L;

	/** The tenant id. */
	private int tenantId;
	
	/** The tenant. */
	private Tenant tenant;
	
	/** The locations. */
	private List<Location> locations;
	
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
	 * @return the locations
	 */
	public List<Location> getLocations() {
		return locations;
	}

	/**
	 * @param locations the locations to set
	 */
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
