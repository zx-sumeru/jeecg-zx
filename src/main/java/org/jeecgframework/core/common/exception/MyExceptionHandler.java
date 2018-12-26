package org.jeecgframework.core.common.exception;

import lombok.extern.slf4j.Slf4j;
//import org.apache.log4j.Logger;
import org.jeecgframework.core.util.ExceptionUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * spring mvc异常捕获类
 * 
 */
@Slf4j
@Component
public class MyExceptionHandler implements HandlerExceptionResolver {

	//private static final Logger log = Logger
	//		.getLogger(MyExceptionHandler.class);

	public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
		String exceptionMessage = ExceptionUtil.getExceptionMessage(ex);
		log.error(exceptionMessage);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("exceptionMessage", exceptionMessage);
		model.put("ex", ex);
		return new ModelAndView("common/error", model);
	}
}
