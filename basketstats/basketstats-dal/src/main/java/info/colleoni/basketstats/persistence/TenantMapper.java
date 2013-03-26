package info.colleoni.basketstats.persistence;

import info.colleoni.basketstats.domain.Tenant;

import java.util.Map;

/**
 * The Interface TenantMapper.
 */
public interface TenantMapper extends CRUDMapper<Tenant> {

	/**
	 * By key.
	 *
	 * @param params the params
	 * @return the tenant
	 */
	Tenant byKey(Map<String, String> params);

}
