/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Referee;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class RefereeService extends CRUDService<Referee>{

	@Autowired
	private CRUDMapper<Referee> refereeMapper;

	@Override
	protected CRUDMapper<Referee> getElementMapper() {
		return refereeMapper;
	}
	
}
