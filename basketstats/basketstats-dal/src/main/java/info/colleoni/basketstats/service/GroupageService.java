/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Groupage;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class GroupageService extends CRUDService<Groupage>{

	@Autowired
	private CRUDMapper<Groupage> groupageMapper;

	@Override
	protected CRUDMapper<Groupage> getElementMapper() {
		return groupageMapper;
	}
	
}
