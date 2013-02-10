/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Referee;

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
public class RefereeServiceTest {

	@Autowired
	private transient RefereeService refereeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.RefereeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Referee r : refereeService.all()) {
			testResult = true;
			System.out.println(r.getRefereeTypeId());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Referee r = new Referee();
		
		r.setGameId(1);
		r.setPersonId(1);
		r.setRefereeTypeId(1);
		refereeService.insert(r);
		Assert.assertTrue(r.getId() > 0);

		r = refereeService.get(r.getId());
		r.setRefereeTypeId(2);
		refereeService.update(r);
		r = refereeService.get(r.getId());
		Assert.assertEquals(r.getRefereeTypeId(), 2);

		refereeService.delete(r);
		r = refereeService.get(r.getId());
		Assert.assertNull(r);
	}
}
