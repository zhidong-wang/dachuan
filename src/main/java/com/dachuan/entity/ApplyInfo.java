package com.dachuan.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 订单基本信息 SA_SaleOrder
 * 对应excel页签 S2订单列表
 */
@Setter
@Getter
public class ApplyInfo {
    // 客户id
    private int idCustomer;

    // 合同号
    private String contractCode;

    // 加工厂
    private String pubuserdefnvc4;

    // 订单日期
    private Date voucherDate;
}
