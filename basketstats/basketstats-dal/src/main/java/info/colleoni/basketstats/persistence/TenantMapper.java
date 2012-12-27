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
}
