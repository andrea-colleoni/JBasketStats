/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.DocumentType;

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
public class DocumentTypeServiceTest {

	@Autowired
	private transient DocumentTypeService documentTypeService;

	/**
	 * Test method for
	 * {@link info.colleoni.basketstats.service.DocumentTypeService#all()}.
	 */
	@Test
	public void testAll() {
		boolean testResult = false;
		for (DocumentType t : documentTypeService.all()) {
			testResult = true;
			System.out.println(t.getDescription());
		}
		Assert.assertTrue(testResult);
	}

	@Test
	public void testDML() {
		DocumentType at = new DocumentType();
		
		at.setDescription("Test");
		at.setName("Test");
		documentTypeService.insert(at);
		Assert.assertTrue(at.getId() > 0);

		at = documentTypeService.get(at.getId());
		at.setDescription("modified");
		documentTypeService.update(at);
		at = documentTypeService.get(at.getId());
		Assert.assertEquals(at.getDescription(), "modified");

		documentTypeService.delete(at);
		at = documentTypeService.get(at.getId());
		Assert.assertNull(at);
	}
}
