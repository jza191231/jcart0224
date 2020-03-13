package com.jza.jzaredistest.mapper;

import com.github.pagehelper.Page;
import com.jza.jzaredistest.pojo.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    Page<City> search();
}