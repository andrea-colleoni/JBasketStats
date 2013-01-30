package info.colleoni.basketstats.domain;

import java.util.Date;

/**
 * The Class Attachment.
 */
public final class Attachment extends ElementType {
	
	/** The gema id. */
	private int gemaId;
	
	/** The game. */
	private Game game;
	
	/** The mime type. */
	private String mimeType;
	
	/** The content. */
	private byte[] content;
	
	/** The attachment type id. */
	private int attachmentTypeId;
	
	/** The attachment type. */
	private AttachmentType attachmentType;
	
	/** The member id. */
	private int memberId;
	
	/** The member. */
	private Member member;
	
	/** The team id. */
	private int teamId;
	
	/** The team. */
	private Team team;
	
	/** The person id. */
	private int personId;
	
	/** The person. */
	private Person person;
	
	/** The creation date. */
	private Date creationDate;
	
	/**
	 * Gets the gema id.
	 *
	 * @return the gemaId
	 */
	public int getGemaId() {
		return gemaId;
	}
	
	/**
	 * Sets the gema id.
	 *
	 * @param gemaId the gemaId to set
	 */
	public void setGemaId(int gemaId) {
		this.gemaId = gemaId;
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
	 * Gets the mime type.
	 *
	 * @return the mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}
	
	/**
	 * Sets the mime type.
	 *
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public byte[] getContent() {
		return content;
	}
	
	/**
	 * Sets the content.
	 *
	 * @param content the content to set
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}
	
	/**
	 * Gets the attachment type id.
	 *
	 * @return the attachmentTypeId
	 */
	public int getAttachmentTypeId() {
		return attachmentTypeId;
	}
	
	/**
	 * Sets the attachment type id.
	 *
	 * @param attachmentTypeId the attachmentTypeId to set
	 */
	public void setAttachmentTypeId(int attachmentTypeId) {
		this.attachmentTypeId = attachmentTypeId;
	}
	
	/**
	 * Gets the attachment type.
	 *
	 * @return the attachmentType
	 */
	public AttachmentType getAttachmentType() {
		return attachmentType;
	}
	
	/**
	 * Sets the attachment type.
	 *
	 * @param attachmentType the attachmentType to set
	 */
	public void setAttachmentType(AttachmentType attachmentType) {
		this.attachmentType = attachmentType;
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
	 * Gets the creation date.
	 *
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	
	/**
	 * Sets the creation date.
	 *
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
