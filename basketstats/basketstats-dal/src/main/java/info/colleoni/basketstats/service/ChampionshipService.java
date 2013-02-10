/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Championship;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class ChampionshipService extends CRUDService<Championship>{

	@Autowired
	private CRUDMapper<Championship> championshipMapper;

	@Override
	protected CRUDMapper<Championship> getElementMapper() {
		return championshipMapper;
	}
	
}
