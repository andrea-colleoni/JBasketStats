/**
 * 
 */
package info.colleoni.basketstats.persistence;

import info.colleoni.basketstats.domain.AuthAuthz;

/**
 * @author andrea.colleoni
 *
 */
public interface AuthAuthzMapper extends CRUDMapper<AuthAuthz> {

	/**
	 * By uri.
	 *
	 * @param uri the uri
	 * @return the auth authz
	 */
	AuthAuthz byUri(String uri);
}
