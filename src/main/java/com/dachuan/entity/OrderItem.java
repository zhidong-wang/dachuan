package com.dachuan.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 录入明细
 * 对应excel页签 S4明细录入界面
 */
@Setter
@Getter
public class OrderItem {
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

    // 染厂配缸数
    private String pubuserdefdecm2;

    // 染厂出缸数
    private String pubuserdefdecm3;

    // 场内整理数
    private String pubuserdefdecm4;

    // 创建时间
    private Date createDate;

    // 更新时间
    private Date updateDate;
}
