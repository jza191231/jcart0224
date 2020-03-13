package com.jza.jzaredistest.pojo;

import org.springframework.cache.annotation.Cacheable;

import java.io.Serializable;

public class City implements Serializable {
    private Integer id;

    private Integer provinceId;

    private String cityName;

    private String description;

    public Integer getId() {
        return id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", provinceId=" + provinceId +
                ", cityName='" + cityName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}