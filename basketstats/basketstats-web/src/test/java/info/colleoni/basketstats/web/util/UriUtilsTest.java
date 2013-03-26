/**
 * 
 */
package info.colleoni.basketstats.web.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author andrea.colleoni
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/test-ctx.xml" })
public class UriUtilsTest {

	/**
	 * Test method for {@link info.colleoni.basketstats.web.util.UriUtils#getFirstToken(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetFirstToken() {
		String uri = "/context/TENANT/trailingFolder/trailingResource.html";
		String firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("TENANT", firstToken);
		
		uri = "/context/TENANT";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("TENANT", firstToken);	
		
		uri = "/context/TENANT/";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("TENANT", firstToken);	
		
		uri = "/context/trailingResource.html";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("trailingResource.html", firstToken);	
		
		uri = "/context/TENANT/trailingResource.html";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("TENANT", firstToken);		
		
		uri = "/context/TENANT/folder/folder/trailingResource.html";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("TENANT", firstToken);
		
		uri = "";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("", firstToken);	
		
		uri = "/";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("", firstToken);			
		
		uri = "/context/";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("", firstToken);		
		
		uri = "/context";
		firstToken = UriUtils.getFirstToken(uri, "/context");
		Assert.assertEquals("", firstToken);				
	}

	/**
	 * Test method for {@link info.colleoni.basketstats.web.util.UriUtils#getTrailingPart(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetTrailingPart() {
		String uri = "/context/TENANT/trailingFolder/trailingResource.html";
		String trailingPart = UriUtils.getTrailingPart(uri, "TENANT");
		Assert.assertEquals("/trailingFolder/trailingResource.html", trailingPart);
		
		uri = "/context/TENANT/trailingFolder/trailingResource.html";
		trailingPart = UriUtils.getTrailingPart(uri, "TENANT", "/context/");
		Assert.assertEquals("/trailingFolder/trailingResource.html", trailingPart);	
		
		uri = "/context/trailingFolder/trailingResource.html";
		trailingPart = UriUtils.getTrailingPart(uri, "/context/", "");
		Assert.assertEquals("/trailingFolder/trailingResource.html", trailingPart);	
		
		uri = "/context//trailingFolder/trailingResource.html";
		trailingPart = UriUtils.getTrailingPart(uri, "/context/", "");
		Assert.assertEquals("/trailingFolder/trailingResource.html", trailingPart);			
		
		uri = "/trailingResource.html";
		trailingPart = UriUtils.getTrailingPart(uri, "");
		Assert.assertEquals("/trailingResource.html", trailingPart);			
	}

}
