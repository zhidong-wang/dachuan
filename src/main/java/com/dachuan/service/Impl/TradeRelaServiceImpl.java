package com.dachuan.service.Impl;

import com.dachuan.entity.TradeRela;
import com.dachuan.mapper.TradeRelaMapper;
import com.dachuan.service.ITradeRelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tradeRelaService")
public class TradeRelaServiceImpl implements ITradeRelaService {

    @Autowired
    private TradeRelaMapper tradeRelaMapper;

    public List<TradeRela> getTradeRelaList() {
         return tradeRelaMapper.getTradeRelaList();
    }
}
