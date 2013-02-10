/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Injury;

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
public class InjuryServiceTest {

	@Autowired
	private transient InjuryService injuryService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.InjuryService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Injury i : injuryService.all()) {
			testResult = true;
			System.out.println(i.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Injury i = new Injury();
		
		i.setDescription("Test");
		i.setMemberId(1);
		i.setInjuryExpiryDate(new Date());
		injuryService.insert(i);
		Assert.assertTrue(i.getId() > 0);

		i = injuryService.get(i.getId());
		i.setDescription("modified");
		injuryService.update(i);
		i = injuryService.get(i.getId());
		Assert.assertEquals(i.getDescription(), "modified");

		injuryService.delete(i);
		i = injuryService.get(i.getId());
		Assert.assertNull(i);
	}
}
