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
 * @author andrea.colleoni
 * 
 */
@Service
public class TenantService {

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

}
