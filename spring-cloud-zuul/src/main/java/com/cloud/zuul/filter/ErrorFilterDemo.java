package com.cloud.zuul.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

public class ErrorFilterDemo extends SendErrorFilter {

	@Override
	public Object run() {
		try {
			RequestContext ctx = RequestContext.getCurrentContext();
			ExceptionHolder exception = findZuulException(ctx.getThrowable());
			ObjectMapper objectMapper = new ObjectMapper();
			ObjectNode objectNode = objectMapper.createObjectNode();
			objectNode.put("error.status_code", exception.getStatusCode());
			objectNode.put("error.exception", exception.getThrowable().getMessage());
			if (StringUtils.hasText(exception.getErrorCause())) {
				objectNode.put("error.cause", exception.getErrorCause());
			}
			if (!ctx.getResponse().isCommitted()) {
				ctx.getResponse().getOutputStream().print(objectNode.toString());
				ctx.setResponseStatusCode(exception.getStatusCode());
			}
		} catch (Exception ex) {
			ReflectionUtils.rethrowRuntimeException(ex);
		}
		return null;
	}

}
