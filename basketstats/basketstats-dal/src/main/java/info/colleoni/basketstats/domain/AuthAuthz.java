/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;

/**
 * The Class AuthAuthz.
 *
 * @author andrea.colleoni
 */
public class AuthAuthz implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2888880433069182738L;
	
	/** The id. */
	private int id;
	
	/** The uri. */
	private String uri;
	
	/** The needs login. */
	private boolean needsLogin;
	
	/** The needs tenant admin. */
	private boolean needsTenantAdmin;
	
	/** The needs site admin. */
	private boolean needsSiteAdmin;
	
	/** The needs tenant. */
	private boolean needsTenant;	

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the uri.
	 *
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the uri.
	 *
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Checks if is needs login.
	 *
	 * @return the needsLogin
	 */
	public boolean isNeedsLogin() {
		return needsLogin;
	}

	/**
	 * Sets the needs login.
	 *
	 * @param needsLogin the needsLogin to set
	 */
	public void setNeedsLogin(boolean needsLogin) {
		this.needsLogin = needsLogin;
	}

	/**
	 * Checks if is needs tenant admin.
	 *
	 * @return the needsTenantAdmin
	 */
	public boolean isNeedsTenantAdmin() {
		return needsTenantAdmin;
	}

	/**
	 * Sets the needs tenant admin.
	 *
	 * @param needsTenantAdmin the needsTenantAdmin to set
	 */
	public void setNeedsTenantAdmin(boolean needsTenantAdmin) {
		this.needsTenantAdmin = needsTenantAdmin;
	}

	/**
	 * Checks if is needs site admin.
	 *
	 * @return the needsSiteAdmin
	 */
	public boolean isNeedsSiteAdmin() {
		return needsSiteAdmin;
	}

	/**
	 * Sets the needs site admin.
	 *
	 * @param needsSiteAdmin the needsSiteAdmin to set
	 */
	public void setNeedsSiteAdmin(boolean needsSiteAdmin) {
		this.needsSiteAdmin = needsSiteAdmin;
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the needsTenant
	 */
	public boolean isNeedsTenant() {
		return needsTenant;
	}

	/**
	 * @param needsTenant the needsTenant to set
	 */
	public void setNeedsTenant(boolean needsTenant) {
		this.needsTenant = needsTenant;
	}

}
