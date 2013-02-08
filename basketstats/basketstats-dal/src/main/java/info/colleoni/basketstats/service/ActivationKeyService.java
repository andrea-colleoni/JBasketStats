/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.ActivationKey;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class ActivationKeyService extends CRUDService<ActivationKey>{

	@Autowired
	private CRUDMapper<ActivationKey> activationKeyMapper;

	@Override
	protected CRUDMapper<ActivationKey> getElementMapper() {
		return activationKeyMapper;
	}
	
}
