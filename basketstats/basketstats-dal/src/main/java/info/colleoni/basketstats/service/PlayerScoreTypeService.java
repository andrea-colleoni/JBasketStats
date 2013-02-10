/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PlayerScoreType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class PlayerScoreTypeService extends CRUDService<PlayerScoreType>{

	@Autowired
	private CRUDMapper<PlayerScoreType> playerScoreTypeMapper;

	@Override
	protected CRUDMapper<PlayerScoreType> getElementMapper() {
		return playerScoreTypeMapper;
	}
	
}
