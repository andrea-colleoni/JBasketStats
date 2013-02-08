/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.AttachmentType;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class AttachmentTypeService extends CRUDService<AttachmentType>{

	@Autowired
	private CRUDMapper<AttachmentType> attachmentTypeMapper;

	@Override
	protected CRUDMapper<AttachmentType> getElementMapper() {
		return attachmentTypeMapper;
	}
	
}
