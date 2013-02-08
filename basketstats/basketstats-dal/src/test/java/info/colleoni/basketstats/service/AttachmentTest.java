/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Attachment;

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
public class AttachmentTest {

	@Autowired
	private transient AttachmentService attachmentService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.AttachmentService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (Attachment t : attachmentService.all()) {
			testResult = true;
			System.out.println(t.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		Attachment a = new Attachment();
		
		a.setAttachmentTypeId(1);
		a.setContent("Ciao".getBytes());
		a.setCreationDate(new Date());
		a.setDescription("Test");
		a.setGameId(1);
		a.setMemberId(1);
		a.setMimeType("octect-stream");
		a.setName("Test");
		a.setPersonId(1);
		a.setTeamId(1);
		attachmentService.insert(a);
		Assert.assertTrue(a.getId() > 0);

		a = attachmentService.get(a.getId());
		a.setDescription("modified");
		attachmentService.update(a);
		a = attachmentService.get(a.getId());
		Assert.assertEquals(a.getDescription(), "modified");

		attachmentService.delete(a);
		a = attachmentService.get(a.getId());
		Assert.assertNull(a);
	}
}
