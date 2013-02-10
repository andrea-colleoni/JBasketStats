/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Game;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class GameService extends CRUDService<Game>{

	@Autowired
	private CRUDMapper<Game> gameMapper;

	@Override
	protected CRUDMapper<Game> getElementMapper() {
		return gameMapper;
	}
	
}
