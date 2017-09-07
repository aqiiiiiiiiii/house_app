package com.oranfish.house.service.impl;

import com.oranfish.house.annotation.Datasource;
import com.oranfish.house.dao.DbgirlMapper;
import com.oranfish.house.service.DbgirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Datasource(Datasource.DBGIRL)
public class DbgirlServiceImpl implements DbgirlService {

    @Autowired
    private DbgirlMapper dbGirlMapper;

    @Override
    public Integer count() {
        return dbGirlMapper.count();
    }
}
