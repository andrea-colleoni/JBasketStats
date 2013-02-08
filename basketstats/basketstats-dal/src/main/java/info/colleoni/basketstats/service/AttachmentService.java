/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Attachment;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class AttachmentService extends CRUDService<Attachment>{

	@Autowired
	private CRUDMapper<Attachment> attachmentMapper;

	@Override
	protected CRUDMapper<Attachment> getElementMapper() {
		return attachmentMapper;
	}
	
}
