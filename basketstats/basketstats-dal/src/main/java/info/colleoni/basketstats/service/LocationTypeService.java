/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.LocationType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class LocationTypeService extends CRUDService<LocationType>{

	@Autowired
	private CRUDMapper<LocationType> locationTypeMapper;

	@Override
	protected CRUDMapper<LocationType> getElementMapper() {
		return locationTypeMapper;
	}
	
}
