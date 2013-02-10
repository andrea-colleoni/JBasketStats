/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Groupage;

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
public class GroupageServiceTest {

	@Autowired
	private transient GroupageService groupageService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.GroupageService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Groupage g : groupageService.all()) {
			testResult = true;
			System.out.println(g.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Groupage g = new Groupage();
		
		g.setDescription("Test");
		g.setName("Test");
		g.setChampionshipId(2);
		groupageService.insert(g);
		Assert.assertTrue(g.getId() > 0);

		g = groupageService.get(g.getId());
		g.setDescription("modified");
		groupageService.update(g);
		g = groupageService.get(g.getId());
		Assert.assertEquals(g.getDescription(), "modified");

		groupageService.delete(g);
		g = groupageService.get(g.getId());
		Assert.assertNull(g);
	}
}
