/**
 * 
 */
package info.colleoni.basketstats.domain;

/**
 * The Class PeriodScore.
 *
 * @author andrea.colleoni
 */
public final class PeriodScore {
	
	/** The id. */
	private int id;
	
	/** The period type id. */
	private int periodTypeId;
	
	/** The period type. */
	private PeriodType periodType;
	
	/** The game id. */
	private int gameId;
	
	/** The game. */
	private Game game;
	
	/** The home score. */
	private int homeScore;
	
	/** The visitor score. */
	private int visitorScore;
	
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
	 * Gets the period type id.
	 *
	 * @return the periodTypeId
	 */
	public int getPeriodTypeId() {
		return periodTypeId;
	}
	
	/**
	 * Sets the period type id.
	 *
	 * @param periodTypeId the periodTypeId to set
	 */
	public void setPeriodTypeId(int periodTypeId) {
		this.periodTypeId = periodTypeId;
	}
	
	/**
	 * Gets the period type.
	 *
	 * @return the periodType
	 */
	public PeriodType getPeriodType() {
		return periodType;
	}
	
	/**
	 * Sets the period type.
	 *
	 * @param periodType the periodType to set
	 */
	public void setPeriodType(PeriodType periodType) {
		this.periodType = periodType;
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
	 * Gets the home score.
	 *
	 * @return the homeScore
	 */
	public int getHomeScore() {
		return homeScore;
	}
	
	/**
	 * Sets the home score.
	 *
	 * @param homeScore the homeScore to set
	 */
	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}
	
	/**
	 * Gets the visitor score.
	 *
	 * @return the visitorScore
	 */
	public int getVisitorScore() {
		return visitorScore;
	}
	
	/**
	 * Sets the visitor score.
	 *
	 * @param visitorScore the visitorScore to set
	 */
	public void setVisitorScore(int visitorScore) {
		this.visitorScore = visitorScore;
	}
}
