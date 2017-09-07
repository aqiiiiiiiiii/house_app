package com.oranfish.house.service.impl;

import com.oranfish.house.annotation.Datasource;
import com.oranfish.house.common.DateUtils;
import com.oranfish.house.dao.HouseMapper;
import com.oranfish.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    @Datasource(Datasource.HOUSE)
    public Integer count() {
        return houseMapper.count(DateUtils.getToday(), DateUtils.getTodayAddDay(1));
    }
}
