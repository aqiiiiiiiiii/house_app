package com.oranfish.house.dao;

import com.oranfish.house.entity.House;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface HouseMapper {
    Integer count(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
//    Integer batchInsert(@Param("houseList") List<House> houseList);
//    Integer countSingleHouse(@Param("house") House house, @Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}
