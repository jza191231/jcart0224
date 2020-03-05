package io.jza.jcartadministrationback.dto.out;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class OrderListOutDTO {
    private Long orderId;
    private Integer customerId;
    private String customerName;
    private Byte status;
    private Double totalPrice;
    @JsonIgnore
    private Date createTime;
    private Long createTimestamp;
    @JsonIgnore
    private Date updateTime;
    private Long updateTimestamp;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double totalPrice() {
        return totalPrice;
    }

    public void totalPrice(Double totalPirce) {
        this.totalPrice = totalPrice;
    }

    public Long getCreateTimestamp() {
        return createTime == null ? null : this.createTime.getTime();
    }

    public Long getUpdateTimestamp() {

        return this.updateTime == null ? null : this.getUpdateTime().getTime();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
