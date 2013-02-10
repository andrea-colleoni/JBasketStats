/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class Injury.
 *
 * @author andrea.colleoni
 */
public final class Injury implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4021098889718831130L;

	/** The id. */
	private int id;
	
	/** The description. */
	private String description;
	
	/** The member id. */
	private int memberId;
	
	/** The memebr. */
	private Member memebr;
	
	/** The injury expiry date. */
	private Date injuryExpiryDate;
	
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
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the member id.
	 *
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}
	
	/**
	 * Sets the member id.
	 *
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	/**
	 * Gets the memebr.
	 *
	 * @return the memebr
	 */
	public Member getMemebr() {
		return memebr;
	}
	
	/**
	 * Sets the memebr.
	 *
	 * @param memebr the memebr to set
	 */
	public void setMemebr(Member memebr) {
		this.memebr = memebr;
	}
	
	/**
	 * Gets the injury expiry date.
	 *
	 * @return the injuryExpiryDate
	 */
	public Date getInjuryExpiryDate() {
		return injuryExpiryDate;
	}
	
	/**
	 * Sets the injury expiry date.
	 *
	 * @param injuryExpiryDate the injuryExpiryDate to set
	 */
	public void setInjuryExpiryDate(Date injuryExpiryDate) {
		this.injuryExpiryDate = injuryExpiryDate;
	}
}
