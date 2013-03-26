/**
 * 
 */
package info.colleoni.basketstats.persistence;

import info.colleoni.basketstats.domain.Person;

import java.util.List;

/**
 * @author andrea.colleoni
 *
 */
public interface PersonMapper extends CRUDMapper<Person> {

	/**
	 * All by tenant.
	 *
	 * @param tenantKey the tenant key
	 * @return the list
	 */
	List<Person> allByTenant(String tenantKey);
}
