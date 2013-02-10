/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class MedicalReview.
 *
 * @author andrea.colleoni
 */
public class MedicalReview implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4276942361189759682L;

	/** The id. */
	private int id;
	
	/** The review date. */
	private Date reviewDate;
	
	/** The review expirty date. */
	private Date reviewExpiryDate;
	
	/** The organization id. */
	private int organizationId;
	
	/** The organization. */
	private Organization organization;
	
	/** The person id. */
	private int personId;
	
	/** The person. */
	private Person person;
	
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
	 * Gets the review date.
	 *
	 * @return the reviewDate
	 */
	public Date getReviewDate() {
		return reviewDate;
	}
	
	/**
	 * Sets the review date.
	 *
	 * @param reviewDate the reviewDate to set
	 */
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	
	/**
	 * Gets the review expirty date.
	 *
	 * @return the reviewExpirtyDate
	 */
	public Date getReviewExpiryDate() {
		return reviewExpiryDate;
	}
	
	/**
	 * Sets the review expirty date.
	 *
	 * @param reviewExpirtyDate the reviewExpirtyDate to set
	 */
	public void setReviewExpiryDate(Date reviewExpirtyDate) {
		this.reviewExpiryDate = reviewExpirtyDate;
	}
	
	/**
	 * Gets the organization id.
	 *
	 * @return the organizationId
	 */
	public int getOrganizationId() {
		return organizationId;
	}
	
	/**
	 * Sets the organization id.
	 *
	 * @param organizationId the organizationId to set
	 */
	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	
	/**
	 * Gets the organization.
	 *
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}
	
	/**
	 * Sets the organization.
	 *
	 * @param organization the organization to set
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	/**
	 * Gets the person id.
	 *
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}
	
	/**
	 * Sets the person id.
	 *
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	/**
	 * Gets the person.
	 *
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	
	/**
	 * Sets the person.
	 *
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
}
