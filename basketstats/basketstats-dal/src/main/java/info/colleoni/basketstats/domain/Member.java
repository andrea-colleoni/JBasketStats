/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.util.List;

/**
 * The Class Member.
 *
 * @author andrea.colleoni
 */
public final class Member {
	
	/** The id. */
	private int id;
	
	/** The person id. */
	private int personId;
	
	/** The person. */
	private Person person;
	
	/** The team id. */
	private int teamId;
	
	/** The team. */
	private Team team;
	
	/** The card number. */
	private String cardNumber;
	
	/** The shirt number. */
	private String shirtNumber;
	
	/** The roles. */
	private List<Role> roles;
	
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
	
	/**
	 * Gets the team id.
	 *
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}
	
	/**
	 * Sets the team id.
	 *
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	/**
	 * Gets the team.
	 *
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}
	
	/**
	 * Sets the team.
	 *
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}
	
	/**
	 * Gets the card number.
	 *
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	
	/**
	 * Sets the card number.
	 *
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	/**
	 * Gets the shirt number.
	 *
	 * @return the shirtNumber
	 */
	public String getShirtNumber() {
		return shirtNumber;
	}
	
	/**
	 * Sets the shirt number.
	 *
	 * @param shirtNumber the shirtNumber to set
	 */
	public void setShirtNumber(String shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
