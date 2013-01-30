/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class TenantService extends CRUDService<Tenant>{

	@Autowired
	private CRUDMapper<Tenant> tenantMapper;

	@Override
	protected CRUDMapper<Tenant> getElementMapper() {
		return tenantMapper;
	}
	
}
