/**
 * 
 */
package info.colleoni.basketstats.domain;

/**
 * The Class Groupage.
 *
 * @author andrea.colleoni
 */
public final class Groupage extends ElementType {
	
	/** The championship id. */
	private int championshipId;
	
	/** The championship. */
	private Season championship;
	
	/**
	 * Gets the championship id.
	 *
	 * @return the championshipId
	 */
	public int getChampionshipId() {
		return championshipId;
	}
	
	/**
	 * Sets the championship id.
	 *
	 * @param championshipId the championshipId to set
	 */
	public void setChampionshipId(int championshipId) {
		this.championshipId = championshipId;
	}
	
	/**
	 * Gets the championship.
	 *
	 * @return the championship
	 */
	public Season getChampionship() {
		return championship;
	}
	
	/**
	 * Sets the championship.
	 *
	 * @param championship the championship to set
	 */
	public void setChampionship(Season championship) {
		this.championship = championship;
	}
}
