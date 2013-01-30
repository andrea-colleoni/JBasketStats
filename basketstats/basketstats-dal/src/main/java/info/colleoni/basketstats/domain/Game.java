/**
 * 
 */
package info.colleoni.basketstats.domain;

import java.util.Date;

/**
 * The Class Game.
 *
 * @author andrea.colleoni
 */
public class Game {
	
	/** The id. */
	private int id;
	
	/** The phase id. */
	private int phaseId;
	
	/** The phase. */
	private Phase phase;
	
	/** The groupage id. */
	private int groupageId;
	
	/** The groupage. */
	private Groupage groupage;
	
	/** The home team id. */
	private int homeTeamId;
	
	/** The home team. */
	private Team homeTeam;
	
	/** The visitor team id. */
	private int visitorTeamId;
	
	/** The visitor team. */
	private Team visitorTeam;
	
	/** The game date. */
	private Date gameDate;
	
	/** The location id. */
	private int locationId;
	
	/** The location. */
	private Location location;
	
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
	 * Gets the phase id.
	 *
	 * @return the phaseId
	 */
	public int getPhaseId() {
		return phaseId;
	}
	
	/**
	 * Sets the phase id.
	 *
	 * @param phaseId the phaseId to set
	 */
	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
	}
	
	/**
	 * Gets the phase.
	 *
	 * @return the phase
	 */
	public Phase getPhase() {
		return phase;
	}
	
	/**
	 * Sets the phase.
	 *
	 * @param phase the phase to set
	 */
	public void setPhase(Phase phase) {
		this.phase = phase;
	}
	
	/**
	 * Gets the groupage id.
	 *
	 * @return the groupageId
	 */
	public int getGroupageId() {
		return groupageId;
	}
	
	/**
	 * Sets the groupage id.
	 *
	 * @param groupageId the groupageId to set
	 */
	public void setGroupageId(int groupageId) {
		this.groupageId = groupageId;
	}
	
	/**
	 * Gets the groupage.
	 *
	 * @return the groupage
	 */
	public Groupage getGroupage() {
		return groupage;
	}
	
	/**
	 * Sets the groupage.
	 *
	 * @param groupage the groupage to set
	 */
	public void setGroupage(Groupage groupage) {
		this.groupage = groupage;
	}
	
	/**
	 * Gets the home team id.
	 *
	 * @return the homeTeamId
	 */
	public int getHomeTeamId() {
		return homeTeamId;
	}
	
	/**
	 * Sets the home team id.
	 *
	 * @param homeTeamId the homeTeamId to set
	 */
	public void setHomeTeamId(int homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	
	/**
	 * Gets the home team.
	 *
	 * @return the homeTeam
	 */
	public Team getHomeTeam() {
		return homeTeam;
	}
	
	/**
	 * Sets the home team.
	 *
	 * @param homeTeam the homeTeam to set
	 */
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	/**
	 * Gets the visitor team id.
	 *
	 * @return the visitorTeamId
	 */
	public int getVisitorTeamId() {
		return visitorTeamId;
	}
	
	/**
	 * Sets the visitor team id.
	 *
	 * @param visitorTeamId the visitorTeamId to set
	 */
	public void setVisitorTeamId(int visitorTeamId) {
		this.visitorTeamId = visitorTeamId;
	}
	
	/**
	 * Gets the visitor team.
	 *
	 * @return the visitorTeam
	 */
	public Team getVisitorTeam() {
		return visitorTeam;
	}
	
	/**
	 * Sets the visitor team.
	 *
	 * @param visitorTeam the visitorTeam to set
	 */
	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}
	
	/**
	 * Gets the game date.
	 *
	 * @return the gameDate
	 */
	public Date getGameDate() {
		return gameDate;
	}
	
	/**
	 * Sets the game date.
	 *
	 * @param gameDate the gameDate to set
	 */
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	
	/**
	 * Gets the location id.
	 *
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}
	
	/**
	 * Sets the location id.
	 *
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
	 * Sets the location.
	 *
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
}
