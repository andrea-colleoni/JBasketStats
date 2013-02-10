/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.KeyType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class KeyTypeService extends CRUDService<KeyType>{

	@Autowired
	private CRUDMapper<KeyType> keyTypeMapper;

	@Override
	protected CRUDMapper<KeyType> getElementMapper() {
		return keyTypeMapper;
	}
	
}
