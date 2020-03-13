package com.jza.jzaredistest.dto.out;

import java.io.Serializable;
import java.util.List;

public class PageOutDTO<T> implements Serializable {

    private Integer pageNum;
    private Integer paegSize;
    private Long total;
    private List<T> list;

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPaegSize() {
        return paegSize;
    }

    public Long getTotal() {
        return total;
    }

    public List<T> getList() {
        return list;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPaegSize(Integer paegSize) {
        this.paegSize = paegSize;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
