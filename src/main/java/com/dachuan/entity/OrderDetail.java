package com.dachuan.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单详情 SA_SaleOrder_b
 * 对应excel页签 S3产品明细表
 */
@Setter
@Getter
public class OrderDetail {
    // 存货id
    private int idinventory;

    // 颜色色号
    private String priuserdefnvc1;

    // 门幅（待定）
    private String priuserdefnvc2;

    // 克重（待定）
    private String priuserdefnvc3;

    // 计划数
    private String quantity;

    // 建议配缸数
    private String pubuserdefdecm1;
}
