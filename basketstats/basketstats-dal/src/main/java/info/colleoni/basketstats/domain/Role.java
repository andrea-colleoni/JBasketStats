/**
 * 
 */
package info.colleoni.basketstats.domain;

/**
 * The Class Role.
 *
 * @author andrea.colleoni
 */
public final class Role extends ElementType {
	
	/** The role type id. */
	private int roleTypeId;
	
	/** The role type. */
	private RoleType roleType;
	
	/**
	 * Gets the role type id.
	 *
	 * @return the roleTypeId
	 */
	public int getRoleTypeId() {
		return roleTypeId;
	}
	
	/**
	 * Sets the role type id.
	 *
	 * @param roleTypeId the roleTypeId to set
	 */
	public void setRoleTypeId(int roleTypeId) {
		this.roleTypeId = roleTypeId;
	}
	
	/**
	 * Gets the role type.
	 *
	 * @return the roleType
	 */
	public RoleType getRoleType() {
		return roleType;
	}
	
	/**
	 * Sets the role type.
	 *
	 * @param roleType the roleType to set
	 */
	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}
}
