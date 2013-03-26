/**
 * 
 */
package info.colleoni.basketstats.web.interceptor;

import info.colleoni.basketstats.domain.AuthAuthz;
import info.colleoni.basketstats.service.AuthAuthzService;
import info.colleoni.basketstats.web.session.ContextData;
import info.colleoni.basketstats.web.util.UriUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author andrea.colleoni
 *
 */
public class AuthInterceptor implements HandlerInterceptor {
	
	/** The logger. */
	Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);
	
	static final String LOGIN_URL = "/login.html"; 
	
	/** The context data. */
	@Autowired
	private ContextData contextData;	
	
	/** The auth authz service. */
	@Autowired
	private AuthAuthzService authAuthzService;
	
	/** The context. */
	@Autowired
	private WebApplicationContext context;	

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		logger.debug("Auth => checking...");	
		boolean _return = true;
		String requestUrl = request.getRequestURI();
		String contextRoot = context.getServletContext().getContextPath();
		String uri = UriUtils.getTrailingPart(requestUrl, contextRoot, contextData.getTenantKey());
		AuthAuthz aa = authAuthzService.byUri(uri);
		_return = _return && (aa == null || !aa.isNeedsLogin() ||
				(aa.isNeedsLogin() && contextData != null && contextData.getUser() != null)
				);
		logger.debug("Auth => " + uri + ": " + _return);
		if (!_return) {
			contextData.setLastRequestUrl(requestUrl);
			response.sendRedirect(contextRoot + LOGIN_URL);
		}
		return _return;
	}

}
