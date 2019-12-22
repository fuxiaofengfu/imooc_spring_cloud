//package com.cloud.client.config;
//
//import brave.SpanCustomizer;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Map;
//
//public class CustomTraceInterceptor extends HandlerInterceptorAdapter {
//
//	/**
//	 * This implementation always returns {@code true}.
//	 *
//	 * @param request
//	 * @param response
//	 * @param handler
//	 */
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		SpanCustomizer span = (SpanCustomizer) request.getAttribute(SpanCustomizer.class.getName());
//		if (null != span) {
//			Map<String, String[]> parameterMap = request.getParameterMap();
//			ObjectMapper objectMapper = new ObjectMapper();
//			span.tag("request.param", objectMapper.writeValueAsString(parameterMap));
//		}
//
//		return true;
//	}
//
//	/**
//	 * This implementation is empty.
//	 *
//	 * @param request
//	 * @param response
//	 * @param handler
//	 * @param ex
//	 */
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//	}
//}
