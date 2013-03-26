/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.User;

import java.util.Date;

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
public class UserServiceTest {

	@Autowired
	private transient UserService userService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.UserService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (User u : userService.all()) {
			testResult = true;
			System.out.println(u.getUsername());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		User u = new User();
		
		u.setTenantId(1);
		u.setUsername("Test");
		u.setPassword("password");
		u.setSubscriptionDate(new Date());
		userService.insert(u);
		Assert.assertTrue(u.getId() > 0);

		u = userService.get(u.getId());
		u.setPassword("modified");
		userService.update(u);
		u = userService.get(u.getId());
		Assert.assertEquals(u.getPassword(), "modified");

		userService.delete(u);
		u = userService.get(u.getId());
		Assert.assertNull(u);
	}
	
	@Test
	public void testLogin() {
		Assert.assertFalse(userService.verify("not-existent", "", "none"));
		Assert.assertFalse(userService.verify("Test", "password", "COLLEONI"));
		User u = userService.byUsername("Test", "COLLEONI").get(0);
		Assert.assertNotNull(u);
	}
}
