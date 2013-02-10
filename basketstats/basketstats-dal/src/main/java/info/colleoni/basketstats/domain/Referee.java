/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.io.Serializable;

/**
 * The Class Referee.
 *
 * @author andrea.colleoni
 */
public final class Referee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 762024401809512436L;

	/** The id. */
	private int id;
	
	/** The person id. */
	private int personId;
	
	/** The person. */
	private Person person;
	
	/** The game id. */
	private int gameId;
	
	/** The game. */
	private Game game;
	
	/** The referee type id. */
	private int refereeTypeId;
	
	/** The referee type. */
	private RefereeType refereeType;
	
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
	 * Gets the game id.
	 *
	 * @return the gameId
	 */
	public int getGameId() {
		return gameId;
	}
	
	/**
	 * Sets the game id.
	 *
	 * @param gameId the gameId to set
	 */
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	/**
	 * Gets the game.
	 *
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}
	
	/**
	 * Sets the game.
	 *
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}
	
	/**
	 * Gets the referee type id.
	 *
	 * @return the refereeTypeId
	 */
	public int getRefereeTypeId() {
		return refereeTypeId;
	}
	
	/**
	 * Sets the referee type id.
	 *
	 * @param refereeTypeId the refereeTypeId to set
	 */
	public void setRefereeTypeId(int refereeTypeId) {
		this.refereeTypeId = refereeTypeId;
	}
	
	/**
	 * Gets the referee type.
	 *
	 * @return the refereeType
	 */
	public RefereeType getRefereeType() {
		return refereeType;
	}
	
	/**
	 * Sets the referee type.
	 *
	 * @param refereeType the refereeType to set
	 */
	public void setRefereeType(RefereeType refereeType) {
		this.refereeType = refereeType;
	}

}
