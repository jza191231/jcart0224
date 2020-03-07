package io.jza.jcartadministrationback.po;

import java.util.Date;

public class OrderHistory {
    private Long orderHistoryId;

    private Long orderId;

    private Date time;

    private Byte orderStatus;

    private String comment;

    private Boolean customerNotified;

    public Long getOrderHistoryId() {
        return orderHistoryId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Date getTime() {
        return time;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getCustomerNotified() {
        return customerNotified;
    }

    public void setOrderHistoryId(Long orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCustomerNotified(Boolean customerNotified) {
        this.customerNotified = customerNotified;
    }
}