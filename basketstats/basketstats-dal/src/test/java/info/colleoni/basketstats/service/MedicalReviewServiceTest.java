/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.MedicalReview;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author andrea.colleoni
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-ctx.xml" })
public class MedicalReviewServiceTest {

	@Autowired
	private transient MedicalReviewService medicalReviewService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.MedicalReviewService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (MedicalReview mr : medicalReviewService.all()) {
			testResult = true;
			System.out.println(mr.getReviewDate());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		MedicalReview mr = new MedicalReview();
		
		mr.setReviewDate(new Date());
		mr.setOrganizationId(1);
		mr.setPersonId(1);
		mr.setReviewExpiryDate(new Date());
		medicalReviewService.insert(mr);
		Assert.assertTrue(mr.getId() > 0);

		mr = medicalReviewService.get(mr.getId());
		mr.setReviewDate(new Date());
		medicalReviewService.update(mr);
		mr = medicalReviewService.get(mr.getId());
		Assert.assertEquals(mr.getReviewExpiryDate(), new Date());

		medicalReviewService.delete(mr);
		mr = medicalReviewService.get(mr.getId());
		Assert.assertNull(mr);
	}
}
