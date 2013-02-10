/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.RefereeType;

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
public class RefereeTypeServiceTest {

	@Autowired
	private transient RefereeTypeService refereeTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.RefereeTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (RefereeType rt : refereeTypeService.all()) {
			testResult = true;
			System.out.println(rt.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		RefereeType rt = new RefereeType();
		
		rt.setDescription("Test");
		rt.setName("Test");
		refereeTypeService.insert(rt);
		Assert.assertTrue(rt.getId() > 0);

		rt = refereeTypeService.get(rt.getId());
		rt.setDescription("modified");
		refereeTypeService.update(rt);
		rt = refereeTypeService.get(rt.getId());
		Assert.assertEquals(rt.getDescription(), "modified");

		refereeTypeService.delete(rt);
		rt = refereeTypeService.get(rt.getId());
		Assert.assertNull(rt);
	}
}
