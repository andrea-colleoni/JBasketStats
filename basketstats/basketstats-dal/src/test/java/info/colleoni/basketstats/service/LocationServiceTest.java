/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Location;

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
public class LocationServiceTest {

	@Autowired
	private transient LocationService locationService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.LocationService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Location l : locationService.all()) {
			testResult = true;
			System.out.println(l.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Location l = new Location();
		
		l.setDescription("Test");
		l.setName("Test");
		l.setTenantId(1);
		l.setLocationTypeId(1);
		locationService.insert(l);
		Assert.assertTrue(l.getId() > 0);

		l = locationService.get(l.getId());
		l.setDescription("modified");
		locationService.update(l);
		l = locationService.get(l.getId());
		Assert.assertEquals(l.getDescription(), "modified");

		locationService.delete(l);
		l = locationService.get(l.getId());
		Assert.assertNull(l);
	}
}
