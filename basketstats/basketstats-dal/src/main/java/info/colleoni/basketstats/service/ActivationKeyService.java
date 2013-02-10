/**  
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.ActivationKey;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * The Class ActivationKeyService.
 *
 * @author acolleoni
 */
public class ActivationKeyService extends CRUDService<ActivationKey>{
	
	/** The activation key mapper. */
	@Autowired
	private CRUDMapper<ActivationKey> activationKeyMapper;

	/* (non-Javadoc)
	 * @see info.colleoni.basketstats.service.CRUDService#getElementMapper()
	 */
	@Override
	protected CRUDMapper<ActivationKey> getElementMapper() {
		return activationKeyMapper;
	}
}
