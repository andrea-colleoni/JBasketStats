/**
 * 
 */
package info.colleoni.basketstats.web.interceptor;

import info.colleoni.basketstats.domain.Tenant;
import info.colleoni.basketstats.service.TenantService;
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
 * The Class TenantInterceptor.
 * 
 * @author andrea.colleoni
 */
public class TenantInterceptor implements HandlerInterceptor {

	/** The logger. */
	Logger logger = LoggerFactory.getLogger(TenantInterceptor.class);

	/** The context data. */
	@Autowired
	private ContextData contextData;

	/** The tenant service. */
	@Autowired
	private TenantService tenantService;

	/** The context. */
	@Autowired
	private WebApplicationContext context;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax
	 * .servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if (modelAndView != null && modelAndView.getModelMap() != null) {
			modelAndView.getModelMap().addAttribute("contextData", contextData);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {
		boolean _return = true;

		String firstUrlToken = UriUtils.getFirstToken(request.getRequestURI(),
				context.getServletContext().getContextPath());

		if ("".equals(firstUrlToken)) {
			
		} else if (!"".equals(firstUrlToken)
				&& !contextData.getTenantKey().equals(firstUrlToken)) {
			Tenant t = tenantService.byKey(firstUrlToken);
			if (t != null) {
				logger.info("TenantInterceptor, new tenant => " + t.getName());
				contextData.setTenant(t);
			}
		}
		return _return;
	}
}
