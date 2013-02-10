/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.MedicalReview;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class MedicalReviewService extends CRUDService<MedicalReview>{

	@Autowired
	private CRUDMapper<MedicalReview> medicalReviewMapper;

	@Override
	protected CRUDMapper<MedicalReview> getElementMapper() {
		return medicalReviewMapper;
	}
	
}
