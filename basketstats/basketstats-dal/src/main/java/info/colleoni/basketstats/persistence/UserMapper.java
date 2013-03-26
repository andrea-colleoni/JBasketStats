package info.colleoni.basketstats.persistence;

import info.colleoni.basketstats.domain.User;

import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Interface TenantMapper.
 */
public interface UserMapper extends CRUDMapper<User> {

	/**
	 * Verify.
	 *
	 * @param credentials the credentials Map
	 * @return the int
	 */
	int verify(Map<String, String> credentials);

	/**
	 * By username.
	 *
	 * @param credentials the credentials
	 * @return the user
	 */
	List<User> byUsername(Map<String, String> credentials);
}
