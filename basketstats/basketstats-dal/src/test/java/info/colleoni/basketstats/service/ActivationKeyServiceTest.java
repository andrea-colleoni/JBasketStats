/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.ActivationKey;

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
public class ActivationKeyServiceTest {

	@Autowired
	private transient ActivationKeyService activationKeyService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.ActivationKeyService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (ActivationKey t : activationKeyService.all()) {
			testResult = true;
			System.out.println(t.getKeyContent());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		ActivationKey ak = new ActivationKey();
		
		ak.setEndDate(new Date());
		ak.setStartDate(new Date());
		ak.setTenantId(1);
		ak.setKeyContent("Test");
		ak.setKeyTypeId(1);
		activationKeyService.insert(ak);
		Assert.assertTrue(ak.getId() > 0);

		ak = activationKeyService.get(ak.getId());
		ak.setKeyContent("modified");
		activationKeyService.update(ak);
		ak = activationKeyService.get(ak.getId());
		Assert.assertEquals(ak.getKeyContent(), "modified");

		activationKeyService.delete(ak);
		ak = activationKeyService.get(ak.getId());
		Assert.assertNull(ak);
	}
}
