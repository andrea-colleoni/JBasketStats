package info.colleoni.basketstats.domain;

import java.util.Date;
/**
 * The Class ActivationKey.
 */
public class ActivationKey {

	/** The end date. */
	private Date endDate;

	/** The key. */
	private String keyContent;
	
	/** The key type. */
	private KeyType keyType;
	
	/** The key type id. */
	private int keyTypeId;
	
	/** The start date. */
	private Date startDate;
	
	/** The tenant. */
	private Tenant tenant;

	/** The tenant id. */
	private int tenantId;

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		// Automatically generated method. Please do not modify this code.
		return this.endDate;
	}

	/**
	 * Gets the key content.
	 *
	 * @return the keyContent
	 */
	public String getKeyContent() {
		return keyContent;
	}

	/**
	 * Gets the key type.
	 *
	 * @return the keyType
	 */
	public KeyType getKeyType() {
		return keyType;
	}

	/**
	 * Gets the key type id.
	 *
	 * @return the keyTypeId
	 */
	public int getKeyTypeId() {
		return keyTypeId;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		// Automatically generated method. Please do not modify this code.
		return this.startDate;
	}

	/**
	 * Gets the tenant.
	 *
	 * @return the tenant
	 */
	public Tenant getTenant() {
		return tenant;
	}

	/**
	 * Gets the tenant id.
	 *
	 * @return the tenantId
	 */
	public int getTenantId() {
		return tenantId;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Sets the key content.
	 *
	 * @param keyContent the keyContent to set
	 */
	public void setKeyContent(String keyContent) {
		this.keyContent = keyContent;
	}

	/**
	 * Sets the key type.
	 *
	 * @param keyType the keyType to set
	 */
	public void setKeyType(KeyType keyType) {
		this.keyType = keyType;
	}

	/**
	 * Sets the key type id.
	 *
	 * @param keyTypeId the keyTypeId to set
	 */
	public void setKeyTypeId(int keyTypeId) {
		this.keyTypeId = keyTypeId;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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
	 * Sets the tenant id.
	 *
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

}
