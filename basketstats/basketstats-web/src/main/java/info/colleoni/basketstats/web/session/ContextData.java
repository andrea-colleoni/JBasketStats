/**
 * 
 */
package info.colleoni.basketstats.web.session;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.domain.User;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * The Class ContextData.
 *
 * @author andrea.colleoni
 */
@Component
@Scope("session")
public class ContextData {

	/** The tenant. */
	private Tenant tenant;
	
	/** The user. */
	private User user;
	
	/** The log on time. */
	private Date logOnTime;
	
	/** The last request url. */
	private String lastRequestUrl;

	/**
	 * Gets the tenant.
	 *
	 * @return the tenant
	 */
	public Tenant getTenant() {
		return tenant;
	}

	/**
	 * Sets the tenant.
	 *
	 * @param tenant the tenant to set
	 */
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	/**
	 * Gets the log on time.
	 *
	 * @return the logOnTime
	 */
	public Date getLogOnTime() {
		return logOnTime;
	}

	/**
	 * Sets the log on time.
	 *
	 * @param logOnTime the logOnTime to set
	 */
	public void setLogOnTime(Date logOnTime) {
		this.logOnTime = logOnTime;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the tenantKey
	 */
	public String getTenantKey() {
		return (tenant == null ? "" : tenant.getKey());
	}

	/**
	 * @return the lastRequestUrl
	 */
	public String getLastRequestUrl() {
		return lastRequestUrl;
	}

	/**
	 * @param lastRequestUrl the lastRequestUrl to set
	 */
	public void setLastRequestUrl(String lastRequestUrl) {
		this.lastRequestUrl = lastRequestUrl;
	}
}
