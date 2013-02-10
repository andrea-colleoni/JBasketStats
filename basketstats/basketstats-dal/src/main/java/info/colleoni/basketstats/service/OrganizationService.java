/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Organization;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class OrganizationService extends CRUDService<Organization>{

	@Autowired
	private CRUDMapper<Organization> organizationMapper;

	@Override
	protected CRUDMapper<Organization> getElementMapper() {
		return organizationMapper;
	}
	
}
