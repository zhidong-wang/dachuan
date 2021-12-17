package com.dachuan.mapper;

import com.dachuan.entity.TradeRela;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TradeRelaMapper {

    List<TradeRela> getTradeRelaList();
}
