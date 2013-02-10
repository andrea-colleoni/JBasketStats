/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PeriodScore;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class PeriodScoreService extends CRUDService<PeriodScore>{

	@Autowired
	private CRUDMapper<PeriodScore> periodScoreMapper;

	@Override
	protected CRUDMapper<PeriodScore> getElementMapper() {
		return periodScoreMapper;
	}
	
}
