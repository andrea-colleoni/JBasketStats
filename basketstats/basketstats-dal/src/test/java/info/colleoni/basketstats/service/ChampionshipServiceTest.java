/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Championship;

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
public class ChampionshipServiceTest {

	@Autowired
	private transient ChampionshipService championshipService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.ChampionshipService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Championship t : championshipService.all()) {
			testResult = true;
			System.out.println(t.getDivision());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Championship c = new Championship();
		
		c.setSeasonId(1);
		c.setTenantId(1);
		c.setDivision("Test");
		championshipService.insert(c);
		Assert.assertTrue(c.getId() > 0);

		c = championshipService.get(c.getId());
		c.setDivision("modified");
		championshipService.update(c);
		c = championshipService.get(c.getId());
		Assert.assertEquals(c.getDivision(), "modified");

		championshipService.delete(c);
		c = championshipService.get(c.getId());
		Assert.assertNull(c);
	}
}
