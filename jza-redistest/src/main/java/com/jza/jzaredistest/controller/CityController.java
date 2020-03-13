package com.jza.jzaredistest.controller;

import com.github.pagehelper.Page;
import com.jza.jzaredistest.dto.CityCreateInDTO;
import com.jza.jzaredistest.dto.out.CityListOutDTO;
import com.jza.jzaredistest.dto.out.PageOutDTO;
import com.jza.jzaredistest.pojo.City;
import com.jza.jzaredistest.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jza")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/list")
    public PageOutDTO<CityListOutDTO> search(
            @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        Page<City> cities = cityService.search(pageNum);
        List<CityListOutDTO> cityListOutDTOS = cities.stream().map(city -> {
            CityListOutDTO cityListOutDTO = new CityListOutDTO();
            cityListOutDTO.setId(city.getId());
            cityListOutDTO.setProvinceId(city.getProvinceId());
            cityListOutDTO.setCityName(city.getCityName());
            cityListOutDTO.setDescription(city.getDescription());
            return cityListOutDTO;
        }).collect(Collectors.toList());

        PageOutDTO<CityListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setPageNum(cities.getPageNum());
        pageOutDTO.setPaegSize(cities.getPageSize());
        pageOutDTO.setTotal(cities.getTotal());
        pageOutDTO.setList(cityListOutDTOS);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public CityListOutDTO findById(Integer id){
        CityListOutDTO cityListOutDTO = new CityListOutDTO();
        City city = cityService.findCityById(id);
        cityListOutDTO.setId(city.getId());
        cityListOutDTO.setProvinceId(city.getProvinceId());
        cityListOutDTO.setCityName(city.getCityName());
        cityListOutDTO.setDescription(city.getDescription());
        return cityListOutDTO;
    }
    
    @PostMapping("/save")
    public Integer save(@RequestBody CityCreateInDTO cityCreateInDTO){
        Integer id = cityService.save(cityCreateInDTO);
        return id;
    }

    @PostMapping("/update")
    public Integer update(@RequestBody City city){
        Integer id = cityService.updateCity(city);
        return id;
    }
}
