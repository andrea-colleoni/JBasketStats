/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Location;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class LocationService extends CRUDService<Location>{

	@Autowired
	private CRUDMapper<Location> locationMapper;

	@Override
	protected CRUDMapper<Location> getElementMapper() {
		return locationMapper;
	}
	
}
