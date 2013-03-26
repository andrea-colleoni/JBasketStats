/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.AuthAuthz;

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
public class AuthAuthzServiceTest {

	@Autowired
	private transient AuthAuthzService authAuthzService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.AuthAuthzService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (AuthAuthz aa : authAuthzService.all()) {
			testResult = true;
			System.out.println(aa.getUri());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		AuthAuthz aa = new AuthAuthz();
		
		aa.setNeedsLogin(true);
		aa.setNeedsSiteAdmin(true);
		aa.setNeedsTenantAdmin(true);
		aa.setUri("Test");
		authAuthzService.insert(aa);
		Assert.assertTrue(aa.getId() > 0);

		aa = authAuthzService.get(aa.getId());
		aa.setUri("modified");
		authAuthzService.update(aa);
		aa = authAuthzService.get(aa.getId());
		Assert.assertEquals(aa.getUri(), "modified");

		authAuthzService.delete(aa);
		aa = authAuthzService.get(aa.getId());
		Assert.assertNull(aa);
	}
}
