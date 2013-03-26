/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.User;
import info.colleoni.basketstats.persistence.UserMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class UserService extends CRUDService<User>{

	/** The user mapper. */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * Verify.
	 *
	 * @param username the username
	 * @param password the password
	 * @param tenantKey the tenant key
	 * @return true, if successful
	 */
	public boolean verify(String username, String password, String tenantKey) {
		Map<String, String> credentials = new HashMap<String, String>();
		credentials.put("username",  username);
		credentials.put("password",  password);
		credentials.put("tenantKey",  tenantKey);
		return userMapper.verify(credentials) == 1;
	}
	
	/**
	 * By username.
	 *
	 * @param username the username
	 * @param tenantKey the tenant key
	 * @return the user
	 */
	public List<User> byUsername(String username, String tenantKey) {
		Map<String, String> credentials = new HashMap<String, String>();
		credentials.put("username",  username);
		credentials.put("tenantKey",  tenantKey);
		return userMapper.byUsername(credentials);
	}

	/* (non-Javadoc)
	 * @see info.colleoni.basketstats.service.CRUDService#getElementMapper()
	 */
	@Override
	protected UserMapper getElementMapper() {
		return userMapper;
	}
	
}
