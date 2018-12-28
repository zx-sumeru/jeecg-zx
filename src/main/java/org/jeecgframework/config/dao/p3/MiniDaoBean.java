package org.jeecgframework.config.dao.p3;

import com.jeecg.domo.order.dao.JpDemoOrderProductDao;
import org.jeecgframework.core.annotation.MiniDaoRepository;
import org.springframework.stereotype.Component;

/**
 * @author sbdz
 * @date 2018/12/28 13:36
 */
@Component
public class MiniDaoBean {

    @MiniDaoRepository
    public interface JpDemoOrderProductDao extends com.jeecg.domo.order.dao.JpDemoOrderProductDao {
    }

}
