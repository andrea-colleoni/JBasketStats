/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Member;

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
public class MemberServiceTest {

	@Autowired
	private transient MemberService memberService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.MemberService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Member m : memberService.all()) {
			testResult = true;
			System.out.println(m.getCardNumber());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Member m = new Member();
		
		m.setCardNumber("Test");
		m.setPersonId(1);
		m.setShirtNumber("1");
		m.setTeamId(1);
		memberService.insert(m);
		Assert.assertTrue(m.getId() > 0);

		m = memberService.get(m.getId());
		m.setCardNumber("modified");
		memberService.update(m);
		m = memberService.get(m.getId());
		Assert.assertEquals(m.getCardNumber(), "modified");

		memberService.delete(m);
		m = memberService.get(m.getId());
		Assert.assertNull(m);
	}
}
