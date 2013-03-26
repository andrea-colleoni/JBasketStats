/**
 * 
 */
package info.colleoni.basketstats.web.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andrea.colleoni
 * 
 */
public class UriUtils {

	/** The logger. */
	static Logger logger = LoggerFactory.getLogger(UriUtils.class);

	public static String getFirstToken(String url, String contextPath) {
		String _return = "";
		if (url != null) {
			// remove first slash
			if (url.length() > 0 && url.charAt(0) == '/') {
				url = url.substring(1);
			}
			try {
				String[] tokens = url.split("/");
				contextPath = contextPath.replaceAll("/", "");
				if (tokens.length > 0 && tokens[0] != null
						&& tokens[0].equals(contextPath)) {
					if (tokens.length >= 2) {
						_return = tokens[1];
					}
				}
				logger.debug("getFirstToken, firstUrlToken => " + _return);
			} catch (Exception ex) {
				logger.warn("getFirstToken, firstUrlToken => " + _return, ex);
			}
		}
		return _return;
	}

	/**
	 * Returns url if token is empty or null Returns part after token if it is
	 * not null
	 * 
	 * @param url
	 * @param token
	 * @return
	 */
	public static String getTrailingPart(String url, String token) {
		String _return = "";
		if (url != null) {
			// remove first slash
			if (url.length() > 0 && url.charAt(0) == '/') {
				url = url.substring(1);
			}
			try {
				String[] tokens = url.split("/");
				token = token.replaceAll("/", "");
				int tokenIndex = -1;
				for (int i = 0; i < tokens.length; i++) {
					if (tokens[i].equals(token)) {
						tokenIndex = i;
					}
				}
				if (tokens.length > tokenIndex) {
					for (int i = tokenIndex + 1; i < tokens.length; i++) {
						if (tokens[i].length() > 0) {
							_return += "/" + tokens[i];
						}
					}
				}
			} catch (Exception ex) {
				logger.warn("getTrailingPart, trailingPart => " + _return, ex);
			}
		}
		logger.debug("getTrailingPart, trailingPart => " + _return);
		return _return;
	}

	public static String getTrailingPart(String url, String contextPath,
			String tenant) {
		String _return = getTrailingPart(getTrailingPart(url, contextPath),
				tenant);
		logger.debug("getTrailingPart, trailingPart => " + _return);
		return _return;
	}
}
