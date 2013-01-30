/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.persistence.CRUDMapper;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class CRUDService.
 *
 * @param <T> the generic type
 * @author andrea.colleoni
 */
public abstract class CRUDService<T> {


	/**
	 * All.
	 *
	 * @return the list
	 */
	public List<T> all() {
		return getElementMapper().all();
	}
	

	/**
	 * Gets the.
	 *
	 * @param elementId the element id
	 * @return the t
	 */
	public T get(int elementId) {
		return getElementMapper().get(elementId);
	}
	
	/**
	 * Insert.
	 *
	 * @param element the element
	 */
	public void insert(T element) {
		getElementMapper().create(element);
	}
	
	/**
	 * Update.
	 *
	 * @param element the element
	 */
	public void update(T element) {
		getElementMapper().save(element);
	}	
	
	/**
	 * Delete.
	 *
	 * @param element the element
	 */
	public void delete(T element) {
		getElementMapper().remove(element);
	}


	/**
	 * Gets the element mapper.
	 *
	 * @return the element mapper
	 */
	protected abstract CRUDMapper<T> getElementMapper();

}
