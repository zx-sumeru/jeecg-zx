package com.example.minidaodemo.minidao;

import com.example.minidaodemo.model.CcbMerchant;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.Sql;

import java.util.List;

/**
 * @author sbdz
 * @date 2018/12/29 8:16
 */
@MiniDao
public interface CcbMerchantDao {
    //@MiniDao
    //public interface UserDao {
    //    /**
    //     * 查询用户列表
    //     * @return
    //     */
    //    @Sql("select id,username,realname,password from user")
    //    List<User> getList();
    //
    //    /**
    //     * 删除用户
    //     * @param id 用户ID
    //     */
    //    void delUser(@Param("id")String id);
    //}


    @Sql("select id,park_id,park_name from tb_ccb_merchant")
    List<CcbMerchant> getList();


    @Sql("select * from tb_ccb_merchant where id = :id")
    CcbMerchant findById(@Param("id") Integer id);
}
