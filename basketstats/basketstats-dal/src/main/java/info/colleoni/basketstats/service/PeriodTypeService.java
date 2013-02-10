/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PeriodType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class PeriodTypeService extends CRUDService<PeriodType>{

	@Autowired
	private CRUDMapper<PeriodType> periodTypeMapper;

	@Override
	protected CRUDMapper<PeriodType> getElementMapper() {
		return periodTypeMapper;
	}
	
}
