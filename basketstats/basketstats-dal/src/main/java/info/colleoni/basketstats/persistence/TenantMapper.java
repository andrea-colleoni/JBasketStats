package info.colleoni.basketstats.persistence;

import info.colleoni.basketstats.domain.Tenant;

import java.util.List;

/**
 * The Interface TenantMapper.
 */
public interface TenantMapper {

	/**
	 * All.
	 * 
	 * @return the list
	 */
	List<Tenant> all();

	/**
	 * Gets the tenant.
	 *
	 * @param tenantId the tenant id
	 * @return the tenant
	 */
	Tenant getTenant(int tenantId);

	/**
	 * Insert tenant.
	 *
	 * @param tenant the tenant
	 */
	void create(Tenant tenant);

	/**
	 * Update tenant.
	 *
	 * @param tenant the tenant
	 */
	void save(Tenant tenant);

	/**
	 * Delete tenant.
	 *
	 * @param tenant the tenant
	 */
	void remove(Tenant tenant);
}
