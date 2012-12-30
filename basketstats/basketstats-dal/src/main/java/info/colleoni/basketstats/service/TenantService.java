/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.persistence.TenantMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class TenantService {

	/** The tenant mapper. */
	@Autowired
	private TenantMapper tenantMapper;
	
	/**
	 * All.
	 *
	 * @return the list
	 */
	public List<Tenant> all() {
		return tenantMapper.all();
	}
	
	/**
	 * Gets the.
	 *
	 * @param tenantId the tenant id
	 * @return the tenant
	 */
	public Tenant get(int tenantId) {
		return tenantMapper.getTenant(tenantId);
	}
	
	/**
	 * Insert.
	 *
	 * @param tenant the tenant
	 */
	public void insert(Tenant tenant) {
		tenantMapper.create(tenant);
	}
	
	/**
	 * Update.
	 *
	 * @param tenant the tenant
	 */
	public void update(Tenant tenant) {
		tenantMapper.save(tenant);
	}	
	
	/**
	 * Delete.
	 *
	 * @param tenant the tenant
	 */
	public void delete(Tenant tenant) {
		tenantMapper.remove(tenant);
	}	

}
