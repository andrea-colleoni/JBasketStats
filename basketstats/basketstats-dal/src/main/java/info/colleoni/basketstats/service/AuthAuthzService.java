/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.AuthAuthz;
import info.colleoni.basketstats.persistence.AuthAuthzMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 * 
 * @author andrea.colleoni
 */
@Service
public class AuthAuthzService extends CRUDService<AuthAuthz> {

	/** The auth authz mapper. */
	@Autowired
	private AuthAuthzMapper authAuthzMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see info.colleoni.basketstats.service.CRUDService#getElementMapper()
	 */
	@Override
	protected AuthAuthzMapper getElementMapper() {
		return authAuthzMapper;
	}

	/**
	 * By uri.
	 * 
	 * @param uri
	 *            the uri
	 * @return the auth autz
	 */
	public AuthAuthz byUri(String uri) {
		return authAuthzMapper.byUri(uri);
	}

}
