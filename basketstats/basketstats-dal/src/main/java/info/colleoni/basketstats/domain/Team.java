/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.util.List;

/**
 * The Class Team.
 *
 * @author andrea.colleoni
 */
public final class Team extends ElementType {
	
	/** The organization id. */
	private int organizationId;
	
	/** The organization. */
	private Organization organization;
	
	/** The championships. */
	private List<Championship> championships;
	
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
	 * @return the championships
	 */
	public List<Championship> getChampionships() {
		return championships;
	}

	/**
	 * @param championships the championships to set
	 */
	public void setChampionships(List<Championship> championships) {
		this.championships = championships;
	}
}
