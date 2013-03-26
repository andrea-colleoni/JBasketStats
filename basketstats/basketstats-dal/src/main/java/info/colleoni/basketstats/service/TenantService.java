/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.persistence.CRUDMapper;
import info.colleoni.basketstats.persistence.TenantMapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class TenantService extends CRUDService<Tenant>{

	/** The tenant mapper. */
	@Autowired
	private TenantMapper tenantMapper;

	/* (non-Javadoc)
	 * @see info.colleoni.basketstats.service.CRUDService#getElementMapper()
	 */
	@Override
	protected CRUDMapper<Tenant> getElementMapper() {
		return tenantMapper;
	}
	
	/**
	 * By key.
	 *
	 * @param tenantKey the tenant key
	 * @return the tenant
	 */
	public Tenant byKey(String tenantKey) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("tenantKey",  tenantKey);
		return tenantMapper.byKey(params);
	}	
	
}
