package com.jza.jzaredistest.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jza.jzaredistest.dto.CityCreateInDTO;
import com.jza.jzaredistest.mapper.CityMapper;
import com.jza.jzaredistest.pojo.City;
import com.jza.jzaredistest.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;


@Service
public class CityServiceImpl implements CityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Page<City> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<City> page = cityMapper.search();
        return page;
    }

    @Override
    public City findCityById(Integer id) {
        //从缓存中获取城市信息
        String key = "city_"+id;
        ValueOperations<String,City> operations = redisTemplate.opsForValue();
        //缓存存在
        Boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            City city = JSON.parseObject(JSON.toJSONString(operations.get(key)), City.class);
            LOGGER.info("CityServiceImpl.findCityById() : 从缓存中获取了城市 >>"+city.toString());
            return city;
        }
        //从DB中获取城市信息
        City city = cityMapper.selectByPrimaryKey(id);

        //插入缓存
        operations.set(key,city,10, TimeUnit.MINUTES);
        LOGGER.info("CityServiceImpl.findCityById() : 城市插入缓存 >>"+city.toString());
        return city;
    }

    @Override
    public Integer save(CityCreateInDTO cityCreateInDTO) {
        City city = new City();
        city.setProvinceId(cityCreateInDTO.getProvinceId());
        city.setCityName(cityCreateInDTO.getCityName());
        city.setDescription(cityCreateInDTO.getDescription());
        Integer id = cityMapper.insertSelective(city);
        return id;
    }

    @Override
    public Integer updateCity(City city) {
        Integer id = cityMapper.updateByPrimaryKey(city);
        //缓存存在，删除缓存
        String key="city_"+city.getId();
        Boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            redisTemplate.delete(key);
            LOGGER.info("CityServiceImpl.updateCity() : 从缓存中删除城市 >> " + city.toString());
        }
        return id;
    }
}
