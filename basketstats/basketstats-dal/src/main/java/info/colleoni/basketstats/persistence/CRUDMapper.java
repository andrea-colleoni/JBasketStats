/**
 * 
 */
package info.colleoni.basketstats.persistence;

import java.util.List;

/**
 * The Interface CRUDMapper.
 *
 * @author andrea.colleoni
 * @param <T> the generic type
 */
public interface CRUDMapper<T> {

	/**
	 * All.
	 *
	 * @return the list
	 */
	List<T> all();


	/**
	 * Gets the.
	 *
	 * @param elementId the element id
	 * @return the t
	 */
	T get(int elementId);


	/**
	 * Creates the.
	 *
	 * @param element the element
	 */
	void create(T element);


	/**
	 * Save.
	 *
	 * @param element the element
	 */
	void save(T element);


	/**
	 * Removes the.
	 *
	 * @param element the element
	 */
	void remove(T element);
}
