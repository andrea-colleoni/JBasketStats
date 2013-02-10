/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Person;

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
public class PersonServiceTest {

	@Autowired
	private transient PersonService personService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.PersonService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Person p : personService.all()) {
			testResult = true;
			System.out.println(p.getFullname());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Person p = new Person();
		
		p.setAddress("Test");
		p.setBio("Test");
		p.setBirthDate(new Date());
		p.setBirthPlace("Test");
		p.setCity("Test");
		p.setCountry("Test");
		p.setDocumentId("Test");
		p.setDocumentTypeId(1);
		p.setEmail("Test");
		p.setFullname("Test");
		p.setName("Test");
		p.setNick("Test");
		p.setSurname("Test");
		p.setTenantId(1);
		p.setZipcode("Test");
		p.setNick("Test");
		p.setPhoneNumber("Test");
		personService.insert(p);
		Assert.assertTrue(p.getId() > 0);

		p = personService.get(p.getId());
		p.setAddress("modified");
		personService.update(p);
		p = personService.get(p.getId());
		Assert.assertEquals(p.getAddress(), "modified");

		personService.delete(p);
		p = personService.get(p.getId());
		Assert.assertNull(p);
	}
}
