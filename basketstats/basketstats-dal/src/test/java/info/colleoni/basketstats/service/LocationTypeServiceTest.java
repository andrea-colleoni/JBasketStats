/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.LocationType;

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
public class LocationTypeServiceTest {

	@Autowired
	private transient LocationTypeService locationTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.LocationTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (LocationType lt : locationTypeService.all()) {
			testResult = true;
			System.out.println(lt.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		LocationType lt = new LocationType();
		
		lt.setDescription("Test");
		lt.setName("Test");
		locationTypeService.insert(lt);
		Assert.assertTrue(lt.getId() > 0);

		lt = locationTypeService.get(lt.getId());
		lt.setDescription("modified");
		locationTypeService.update(lt);
		lt = locationTypeService.get(lt.getId());
		Assert.assertEquals(lt.getDescription(), "modified");

		locationTypeService.delete(lt);
		lt = locationTypeService.get(lt.getId());
		Assert.assertNull(lt);
	}
}
