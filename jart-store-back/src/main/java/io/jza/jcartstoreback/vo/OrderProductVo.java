package io.jza.jcartstoreback.vo;

public class OrderProductVo {
    private Integer productId;
    private String productCode;
    private String productName;
    private Integer quantity;
    private Double unitPrice;
    private Double TotalPrice;
    private Integer unitRewordPoints;
    private Integer totalRewordPoints;

    public Integer getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }

    public Integer getUnitRewordPoints() {
        return unitRewordPoints;
    }

    public void setUnitRewordPoints(Integer unitRewordPoints) {
        this.unitRewordPoints = unitRewordPoints;
    }

    public Integer getTotalRewordPoints() {
        return totalRewordPoints;
    }

    public void setTotalRewordPoints(Integer totalRewordPoints) {
        this.totalRewordPoints = totalRewordPoints;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
