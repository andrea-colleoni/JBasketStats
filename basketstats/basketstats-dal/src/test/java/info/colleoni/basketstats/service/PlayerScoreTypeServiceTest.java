/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.PlayerScoreType;

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
public class PlayerScoreTypeServiceTest {

	@Autowired
	private transient PlayerScoreTypeService playerScoreTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.PlayerScoreTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (PlayerScoreType pst : playerScoreTypeService.all()) {
			testResult = true;
			System.out.println(pst.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		PlayerScoreType pst = new PlayerScoreType();
		
		pst.setDescription("Test");
		pst.setName("Test");
		playerScoreTypeService.insert(pst);
		Assert.assertTrue(pst.getId() > 0);

		pst = playerScoreTypeService.get(pst.getId());
		pst.setDescription("modified");
		playerScoreTypeService.update(pst);
		pst = playerScoreTypeService.get(pst.getId());
		Assert.assertEquals(pst.getDescription(), "modified");

		playerScoreTypeService.delete(pst);
		pst = playerScoreTypeService.get(pst.getId());
		Assert.assertNull(pst);
	}
}
