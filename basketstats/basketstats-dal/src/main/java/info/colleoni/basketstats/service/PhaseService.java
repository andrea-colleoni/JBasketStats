/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Phase;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class PhaseService extends CRUDService<Phase>{

	@Autowired
	private CRUDMapper<Phase> phaseMapper;

	@Override
	protected CRUDMapper<Phase> getElementMapper() {
		return phaseMapper;
	}
	
}
