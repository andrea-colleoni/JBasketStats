/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Injury;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class InjuryService extends CRUDService<Injury>{

	@Autowired
	private CRUDMapper<Injury> injuryMapper;

	@Override
	protected CRUDMapper<Injury> getElementMapper() {
		return injuryMapper;
	}
	
}
