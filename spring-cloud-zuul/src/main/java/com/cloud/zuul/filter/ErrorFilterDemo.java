package com.cloud.zuul.filter;

import com.netflix.client.http.HttpResponse;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletResponse;

public class ErrorFilterDemo extends ZuulFilter {
	@Override
	public String filterType() {
		return FilterConstants.ERROR_TYPE;
	}

	@Override
	public int filterOrder() {
		return FilterConstants.SEND_ERROR_FILTER_ORDER - 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		RequestContext currentContext = RequestContext.getCurrentContext();
		Throwable throwable = currentContext.getThrowable();
		currentContext.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		currentContext.set("error.exception",throwable.getCause());
		return null;
	}
}
