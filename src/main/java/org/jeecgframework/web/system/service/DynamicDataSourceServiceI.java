package org.jeecgframework.web.system.service;

import java.util.List;

public interface DynamicDataSourceServiceI{

	public List<DynamicDataSourceEntity> initDynamicDataSource();

	public void refleshCache();


	public DynamicDataSourceEntity getDynamicDataSourceEntityForDbKey(String dbKey);


}
