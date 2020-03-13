package com.jza.jzaredistest.dto;

public class CityCreateInDTO {

    private Integer provinceId;

    private String cityName;

    private String description;

    public Integer getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getDescription() {
        return description;
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
}


