/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Phase;

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
public class PhaseServiceTest {

	@Autowired
	private transient PhaseService phaseService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.PhaseService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Phase p : phaseService.all()) {
			testResult = true;
			System.out.println(p.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Phase p = new Phase();
		
		p.setDescription("Test");
		p.setName("Test");
		phaseService.insert(p);
		Assert.assertTrue(p.getId() > 0);

		p = phaseService.get(p.getId());
		p.setDescription("modified");
		phaseService.update(p);
		p = phaseService.get(p.getId());
		Assert.assertEquals(p.getDescription(), "modified");

		phaseService.delete(p);
		p = phaseService.get(p.getId());
		Assert.assertNull(p);
	}
}
