/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Organization;

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
public class OrganizationServiceTest {

	@Autowired
	private transient OrganizationService organizationService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.OrganizationService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Organization o : organizationService.all()) {
			testResult = true;
			System.out.println(o.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Organization o = new Organization();
		
		o.setDescription("Test");
		o.setName("test");
		o.setTenantId(1);
		organizationService.insert(o);
		Assert.assertTrue(o.getId() > 0);

		o = organizationService.get(o.getId());
		o.setDescription("modified");
		organizationService.update(o);
		o = organizationService.get(o.getId());
		Assert.assertEquals(o.getDescription(), "modified");

		organizationService.delete(o);
		o = organizationService.get(o.getId());
		Assert.assertNull(o);
	}
}
