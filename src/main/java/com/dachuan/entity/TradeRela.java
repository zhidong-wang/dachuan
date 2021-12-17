package com.dachuan.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class TradeRela {
    private Long id;

    private Long ptId;

    private String ptCode;

    private String tradeCode;

    private String status;

    private Date crtTime;

    private Date updTime;
}
