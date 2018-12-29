package com.example.minidaodemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.minidaodemo.minidao.CcbMerchantDao;
import com.example.minidaodemo.minidao.JpDemoOrderCustomDao;
import com.example.minidaodemo.model.CcbMerchant;
import com.example.minidaodemo.model.JpDemoOrderCustomEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sbdz
 * @date 2018/12/29 8:22
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CcbMerchantDao ccbMerchantDao;

    @Autowired
    private JpDemoOrderCustomDao jpDemoOrderCustomDao;

    @RequestMapping("/get")
    public String getCcbMerchant() {
        List<CcbMerchant> list = ccbMerchantDao.getList();
        String string = JSONObject.toJSONString(list);
        log.info(string);
        return string;
    }


    @RequestMapping("/getById")
    public String getCcbMerchant2(Integer id) {
        CcbMerchant merchant = ccbMerchantDao.findById(id);
        String string = JSONObject.toJSONString(merchant);
        log.info(string);
        return string;
    }

    @RequestMapping("/demo")
    public String demo2() {
        JpDemoOrderCustomEntity entity = jpDemoOrderCustomDao.get("402831816286becb016286bfed5d0001");
        String string = JSONObject.toJSONString(entity);
        log.info(string);
        return string;
    }
}
