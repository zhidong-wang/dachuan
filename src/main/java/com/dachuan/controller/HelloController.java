package com.dachuan.controller;

import com.alibaba.fastjson.JSON;
import com.dachuan.service.ITradeRelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.jdbc.core.JdbcTemplate;

@Controller
public class HelloController {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ITradeRelaService tradeRelaService;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        String sql = "select * from pt_trade_rela order by id desc limit 3;";
        System.out.println("data is: " + JSON.toJSONString(jdbcTemplate.queryForList(sql)));
        System.out.println("data list is: " + JSON.toJSONString(tradeRelaService.getTradeRelaList()));
        return "hello xiao jie";
    }

}
