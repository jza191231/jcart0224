package com.jza.jzaredistest.service;

import com.github.pagehelper.Page;
import com.jza.jzaredistest.dto.CityCreateInDTO;
import com.jza.jzaredistest.pojo.City;

public interface CityService {

    Page<City> search(Integer pageNum);

    City findCityById(Integer id);

    Integer save(CityCreateInDTO cityCreateInDTO);

    Integer updateCity(City city);
}
