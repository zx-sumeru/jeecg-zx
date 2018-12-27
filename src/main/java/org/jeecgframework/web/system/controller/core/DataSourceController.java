package org.jeecgframework.web.system.controller.core;



//import org.apache.log4j.Logger;
import lombok.extern.slf4j.Slf4j;
import org.jeecgframework.core.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 数据库管理
 * 
 * @author 张代浩
 * 
 */
@Slf4j
@Controller
@RequestMapping("/dataSourceController")
public class DataSourceController extends BaseController {
	/**
	 * Logger for this class
	 */
	//private static final Logger log = Logger.getLogger(DataSourceController.class);

	/**
	 * 跳转到连接池监控页面
	 * 
	 * @return
	 */
	@RequestMapping(params = "goDruid")
	public ModelAndView goDruid() {
		return new ModelAndView("/system/druid/index");
	}
		

}
