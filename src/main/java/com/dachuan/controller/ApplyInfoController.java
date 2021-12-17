package com.dachuan.controller;

import com.alibaba.fastjson.JSON;
import com.dachuan.entity.ApplyInfo;
import com.dachuan.entity.OrderDetail;
import com.dachuan.entity.OrderItem;
import com.dachuan.util.ResultJsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/applyinfo")
@Slf4j
public class ApplyInfoController {

    /**
     * 订单列表查询接口 -对应excel页签 S2订单列表
     *
     * @param request
     * @param userName
     * @return
     */
    @RequestMapping("querylist")
    @ResponseBody
    public Map<String, Object> queryApplyList(HttpServletRequest request, String userName) {
        List<ApplyInfo> applyInfos = new ArrayList<ApplyInfo>();
        Map<String, Object> result = ResultJsonUtil.getResultMap();
        result.put(ResultJsonUtil.DATA, applyInfos);

        ApplyInfo applyInfo = new ApplyInfo();
        applyInfo.setContractCode("C001");
        applyInfo.setIdCustomer(001);
        applyInfo.setPubuserdefnvc4("001号厂");
        applyInfo.setVoucherDate(new Date());
        applyInfos.add(applyInfo);

        ApplyInfo applyInfo1 = new ApplyInfo();
        BeanUtils.copyProperties(applyInfo, applyInfo1);
        applyInfo1.setContractCode("C002");
        applyInfos.add(applyInfo1);

        log.info("queryApplyList end, data is " + JSON.toJSONString(result));
        return result;
    }

    /**
     * 产品明细表查询接口 -对应excel页签 S3产品明细表
     *
     * @param request
     * @param applyId
     * @return
     */
    @RequestMapping("querydetaillist")
    @ResponseBody
    public Map<String, Object> queryDetailList(HttpServletRequest request, String applyId) {
        List<OrderDetail> detailList = new ArrayList<OrderDetail>();
        Map<String, Object> result = ResultJsonUtil.getResultMap();
        result.put(ResultJsonUtil.DATA, detailList);

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setIdinventory(0001);
        orderDetail.setPriuserdefnvc1("蓝色225#");
        orderDetail.setPriuserdefnvc2("测试-1");
        orderDetail.setPriuserdefnvc3("500g");
        orderDetail.setQuantity("1000");
        orderDetail.setPubuserdefdecm1("600");
        detailList.add(orderDetail);

        OrderDetail orderDetail1 = new OrderDetail();
        BeanUtils.copyProperties(orderDetail, orderDetail1);
        orderDetail1.setPriuserdefnvc1("蓝色226#");
        orderDetail1.setPriuserdefnvc3("800g");
        detailList.add(orderDetail1);

        log.info("queryDetailList end, data is " + JSON.toJSONString(result));
        return result;
    }

    /**
     * 录入记录查询接口 -对应excel页签 S4明细录入界面
     *
     * @param request
     * @param applyId
     * @return
     */
    @RequestMapping("queryitemlist")
    @ResponseBody
    public Map<String, Object> queryDetailInfo(HttpServletRequest request, String applyId) {
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        Map<String, Object> result = ResultJsonUtil.getResultMap();
        result.put(ResultJsonUtil.DATA, orderItems);

        OrderItem orderItem = new OrderItem();
        orderItem.setIdinventory(666);
        orderItem.setPriuserdefnvc1("蓝色225#");
        orderItem.setPriuserdefnvc2("测试-1");
        orderItem.setPriuserdefnvc3("500g");
        orderItem.setPubuserdefdecm1("666");
        orderItem.setQuantity("600");
        orderItem.setPubuserdefdecm2("200");
        orderItem.setPubuserdefdecm3("300");
        orderItem.setPubuserdefdecm4("400");
        orderItem.setCreateDate(new Date());
        orderItem.setUpdateDate(new Date());
        orderItems.add(orderItem);

        OrderItem orderItem1 = new OrderItem();
        BeanUtils.copyProperties(orderItem, orderItem1);
        orderItem1.setPubuserdefdecm2("222");
        orderItem1.setPubuserdefdecm3("333");
        orderItem1.setPubuserdefdecm4("444");
        orderItems.add(orderItem1);

        log.info("queryDetailInfo end, data is " + JSON.toJSONString(result));
        return result;
    }

    /**
     * 录入记录修改 -对应excel页签 S4明细录入界面
     *
     * @param request
     * @param applyId
     * @return
     */
    @RequestMapping("updatedetailinfo")
    @ResponseBody
    public Map<String, Object> updateDetailInfo(HttpServletRequest request, String applyId) {

        return ResultJsonUtil.getResultMap();
    }

    /**
     * 录入记录新增 -对应excel页签 S4明细录入界面
     *
     * @param request
     * @param applyId
     * @return
     */
    @RequestMapping("adddetailinfo")
    @ResponseBody
    public Map<String, Object> addDetailInfo(HttpServletRequest request, String applyId) {

        return ResultJsonUtil.getResultMap();
    }

}
