/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.AttachmentType;

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
public class AttachmentTypeServiceTest {

	@Autowired
	private transient AttachmentTypeService attachmentTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.AttachmentTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (AttachmentType t : attachmentTypeService.all()) {
			testResult = true;
			System.out.println(t.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		AttachmentType at = new AttachmentType();
		
		at.setDescription("Test");
		at.setName("Test");
		attachmentTypeService.insert(at);
		Assert.assertTrue(at.getId() > 0);

		at = attachmentTypeService.get(at.getId());
		at.setDescription("modified");
		attachmentTypeService.update(at);
		at = attachmentTypeService.get(at.getId());
		Assert.assertEquals(at.getDescription(), "modified");

		attachmentTypeService.delete(at);
		at = attachmentTypeService.get(at.getId());
		Assert.assertNull(at);
	}
}
