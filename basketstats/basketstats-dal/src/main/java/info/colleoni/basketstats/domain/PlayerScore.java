/**
 * 
 */
package info.colleoni.basketstats.domain;

/**
 * The Class PlayerScore.
 *
 * @author andrea.colleoni
 */
public final class PlayerScore {
	
	/** The id. */
	private int id;
	
	/** The member id. */
	private int memberId;
	
	/** The member. */
	private Member member;
	
	/** The game id. */
	private int gameId;
	
	/** The game. */
	private Game game;
	
	/** The player score type id. */
	private int playerScoreTypeId;
	
	/** The player score type. */
	private PlayerScoreType playerScoreType;
	
	/** The checked. */
	private boolean checked;
	
	/** The grade. */
	private float grade;
	
	/** The goals. */
	private int goals;
	
	/** The attempts. */
	private int attempts;
	
	/** The notes. */
	private String notes;
	
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
	 * Gets the member.
	 *
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}
	
	/**
	 * Sets the member.
	 *
	 * @param member the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
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
	 * Gets the player score type id.
	 *
	 * @return the playerScoreTypeId
	 */
	public int getPlayerScoreTypeId() {
		return playerScoreTypeId;
	}
	
	/**
	 * Sets the player score type id.
	 *
	 * @param playerScoreTypeId the playerScoreTypeId to set
	 */
	public void setPlayerScoreTypeId(int playerScoreTypeId) {
		this.playerScoreTypeId = playerScoreTypeId;
	}
	
	/**
	 * Gets the player score type.
	 *
	 * @return the playerScoreType
	 */
	public PlayerScoreType getPlayerScoreType() {
		return playerScoreType;
	}
	
	/**
	 * Sets the player score type.
	 *
	 * @param playerScoreType the playerScoreType to set
	 */
	public void setPlayerScoreType(PlayerScoreType playerScoreType) {
		this.playerScoreType = playerScoreType;
	}
	
	/**
	 * Checks if is checked.
	 *
	 * @return the checked
	 */
	public boolean isChecked() {
		return checked;
	}
	
	/**
	 * Sets the checked.
	 *
	 * @param checked the checked to set
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	/**
	 * Gets the grade.
	 *
	 * @return the grade
	 */
	public float getGrade() {
		return grade;
	}
	
	/**
	 * Sets the grade.
	 *
	 * @param grade the grade to set
	 */
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	/**
	 * Gets the goals.
	 *
	 * @return the goals
	 */
	public int getGoals() {
		return goals;
	}
	
	/**
	 * Sets the goals.
	 *
	 * @param goals the goals to set
	 */
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	/**
	 * Gets the attempts.
	 *
	 * @return the attempts
	 */
	public int getAttempts() {
		return attempts;
	}
	
	/**
	 * Sets the attempts.
	 *
	 * @param attempts the attempts to set
	 */
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	
	/**
	 * Gets the notes.
	 *
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * Sets the notes.
	 *
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
