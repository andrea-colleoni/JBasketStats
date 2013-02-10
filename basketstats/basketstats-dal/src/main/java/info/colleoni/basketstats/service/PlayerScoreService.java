/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PlayerScore;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class PlayerScoreService extends CRUDService<PlayerScore>{

	@Autowired
	private CRUDMapper<PlayerScore> playerScoreMapper;

	@Override
	protected CRUDMapper<PlayerScore> getElementMapper() {
		return playerScoreMapper;
	}
	
}
