/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Person;
import info.colleoni.basketstats.persistence.PersonMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 * 
 * @author andrea.colleoni
 */
@Service
public class PersonService extends CRUDService<Person> {

	/** The person mapper. */
	@Autowired
	private PersonMapper personMapper;

	/* (non-Javadoc)
	 * @see info.colleoni.basketstats.service.CRUDService#getElementMapper()
	 */
	@Override
	protected PersonMapper getElementMapper() {
		return personMapper;
	}

	/**
	 * All by tenant.
	 *
	 * @param tenantKey the tenant key
	 * @return the list
	 */
	public List<Person> allByTenant(String tenantKey) {
		return personMapper.allByTenant(tenantKey);
	}

}
