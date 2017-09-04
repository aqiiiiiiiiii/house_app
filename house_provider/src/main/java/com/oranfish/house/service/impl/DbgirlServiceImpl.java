package com.oranfish.house.service.impl;

import com.oranfish.house.annotation.Datasource;
import com.oranfish.house.dao.DbgirlMapper;
import com.oranfish.house.service.DbgirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbgirlServiceImpl implements DbgirlService {

    @Autowired
    private DbgirlMapper dbGirlMapper;

    @Override
    @Datasource("dbgirlDataSource")
    public Integer count() {
        return dbGirlMapper.count();
    }
}
