/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PeriodType;

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
public class PeriodTypeServiceTest {

	@Autowired
	private transient PeriodTypeService periodTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.PeriodTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (PeriodType pt : periodTypeService.all()) {
			testResult = true;
			System.out.println(pt.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		PeriodType pt = new PeriodType();
		
		pt.setDescription("Test");
		pt.setName("Test");
		periodTypeService.insert(pt);
		Assert.assertTrue(pt.getId() > 0);

		pt = periodTypeService.get(pt.getId());
		pt.setDescription("modified");
		periodTypeService.update(pt);
		pt = periodTypeService.get(pt.getId());
		Assert.assertEquals(pt.getDescription(), "modified");

		periodTypeService.delete(pt);
		pt = periodTypeService.get(pt.getId());
		Assert.assertNull(pt);
	}
}
