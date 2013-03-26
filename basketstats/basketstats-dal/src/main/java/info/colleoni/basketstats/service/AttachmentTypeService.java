/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.AttachmentType;
import info.colleoni.basketstats.persistence.AttachmentTypeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class AttachmentTypeService extends CRUDService<AttachmentType>{

	/** The attachment type mapper. */
	@Autowired
	private AttachmentTypeMapper attachmentTypeMapper;

	/* (non-Javadoc)
	 * @see info.colleoni.basketstats.service.CRUDService#getElementMapper()
	 */
	@Override
	protected AttachmentTypeMapper getElementMapper() {
		return attachmentTypeMapper;
	}
	
}
