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
}
