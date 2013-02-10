/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PlayerScore;

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
public class PlayerScoreServiceTest {

	@Autowired
	private transient PlayerScoreService playerScoreService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.PlayerScoreService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (PlayerScore p : playerScoreService.all()) {
			testResult = true;
			System.out.println(p.getNotes());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		PlayerScore p = new PlayerScore();
		
		p.setAttempts(1);
		p.setChecked(true);
		p.setGameId(1);
		p.setGoals(1);
		p.setGrade(1);
		p.setMemberId(1);
		p.setNotes("Test");
		playerScoreService.insert(p);
		Assert.assertTrue(p.getId() > 0);

		p = playerScoreService.get(p.getId());
		p.setNotes("modified");
		playerScoreService.update(p);
		p = playerScoreService.get(p.getId());
		Assert.assertEquals(p.getNotes(), "modified");

		playerScoreService.delete(p);
		p = playerScoreService.get(p.getId());
		Assert.assertNull(p);
	}
}
