/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.DocumentType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class DocumentTypeService extends CRUDService<DocumentType>{

	@Autowired
	private CRUDMapper<DocumentType> tenantMapper;

	@Override
	protected CRUDMapper<DocumentType> getElementMapper() {
		return tenantMapper;
	}
	
}
