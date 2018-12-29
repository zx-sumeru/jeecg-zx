package com.example.minidaodemo.minidao;

import com.example.minidaodemo.model.JpDemoOrderCustomEntity;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.annotation.Sql;
import org.jeecgframework.minidao.pojo.MiniDaoPage;

import java.util.List;

/**
 * @author sbdz
 * @date 2018/12/28 13:34
 */
@MiniDao
public interface JpDemoOrderCustomDao {
    @Sql("SELECT * FROM jp_demo_order_custom WHERE ID like :id")
    JpDemoOrderCustomEntity get(@Param("id") String var1);

    int update(@Param("jpDemoOrderCustom") JpDemoOrderCustomEntity var1);

    void insert(@Param("jpDemoOrderCustom") JpDemoOrderCustomEntity var1);

    @ResultType(JpDemoOrderCustomEntity.class)
    MiniDaoPage<JpDemoOrderCustomEntity> getAll(@Param("jpDemoOrderCustom") JpDemoOrderCustomEntity var1, @Param("page") int var2, @Param("rows") int var3);

    @Sql("DELETE from jp_demo_order_custom WHERE ID = :jpDemoOrderCustom.id")
    void delete(@Param("jpDemoOrderCustom") JpDemoOrderCustomEntity var1);

    @Sql("select * from jp_demo_order_custom where GO_ORDER_CODE =:goOrderCode and delflag = 0")
    List<JpDemoOrderCustomEntity> getByOrderCode(@Param("goOrderCode") String var1);

    @Sql("update jp_demo_order_custom set DELFLAG = 1, DEL_DT = now() where GO_ORDER_CODE =:goOrderCode")
    void delByOrderCode(@Param("goOrderCode") String var1);

    @Sql("DELETE from jp_demo_order_custom WHERE GO_ORDER_CODE =:goOrderCode")
    void deleteByOrderCode(@Param("goOrderCode") String var1);

    @Sql("select count(id) from jp_demo_order_custom where go_order_code = :goOrderCode")
    Integer getCountByOrderCode(@Param("goOrderCode") String var1);
}
