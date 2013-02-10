/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PeriodScore;

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
public class PeriodScoreServiceTest {

	@Autowired
	private transient PeriodScoreService periodScoreService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.PeriodScoreService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (PeriodScore ps : periodScoreService.all()) {
			testResult = true;
			System.out.println(ps.getHomeScore());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		PeriodScore ps = new PeriodScore();
		
		ps.setGameId(1);
		ps.setHomeScore(1);
		ps.setPeriodTypeId(1);
		ps.setVisitorScore(1);
		periodScoreService.insert(ps);
		Assert.assertTrue(ps.getId() > 0);

		ps = periodScoreService.get(ps.getId());
		ps.setHomeScore(10);
		periodScoreService.update(ps);
		ps = periodScoreService.get(ps.getId());
		Assert.assertEquals(ps.getHomeScore(), 10);

		periodScoreService.delete(ps);
		ps = periodScoreService.get(ps.getId());
		Assert.assertNull(ps);
	}
}
