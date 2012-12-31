/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Tenant;

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
public class TenantServiceTest {

	@Autowired
	private transient TenantService tenantService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.TenantService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Tenant t : tenantService.all()) {
			testResult = true;
			System.out.println(t.getName());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Tenant t = new Tenant();
		
		t.setDescription("test tenant");
		t.setName("Test");
		t.setSiteAdmin(false);
		tenantService.insert(t);
		Assert.assertTrue(t.getId() > 0);

		t = tenantService.get(t.getId());
		t.setDescription("modified");
		tenantService.update(t);
		t = tenantService.get(t.getId());
		Assert.assertEquals(t.getDescription(), "modified");

		tenantService.delete(t);
		t = tenantService.get(t.getId());
		Assert.assertNull(t);
	}
}
