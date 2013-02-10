/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Person;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class PersonService extends CRUDService<Person>{

	@Autowired
	private CRUDMapper<Person> personMapper;

	@Override
	protected CRUDMapper<Person> getElementMapper() {
		return personMapper;
	}
	
}
