/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.KeyType;

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
public class KeyTypeServiceTest {

	@Autowired
	private transient KeyTypeService keyTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.KeyTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (KeyType kt : keyTypeService.all()) {
			testResult = true;
			System.out.println(kt.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		KeyType kt = new KeyType();
		
		kt.setDescription("Test");
		kt.setName("Test");
		keyTypeService.insert(kt);
		Assert.assertTrue(kt.getId() > 0);

		kt = keyTypeService.get(kt.getId());
		kt.setDescription("modified");
		keyTypeService.update(kt);
		kt = keyTypeService.get(kt.getId());
		Assert.assertEquals(kt.getDescription(), "modified");

		keyTypeService.delete(kt);
		kt = keyTypeService.get(kt.getId());
		Assert.assertNull(kt);
	}
}
