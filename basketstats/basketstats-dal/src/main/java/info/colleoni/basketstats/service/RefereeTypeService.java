/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.RefereeType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class RefereeTypeService extends CRUDService<RefereeType>{

	@Autowired
	private CRUDMapper<RefereeType> refereeTypeMapper;

	@Override
	protected CRUDMapper<RefereeType> getElementMapper() {
		return refereeTypeMapper;
	}
	
}
