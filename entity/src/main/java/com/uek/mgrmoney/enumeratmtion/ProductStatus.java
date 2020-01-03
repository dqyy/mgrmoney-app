package com.uek.mgrmoney.enumeratmtion;
//产品状态
public enum ProductStatus {
    LOCKED("锁定"),SALING("销售中"),END("停售");
    private String desc;
    ProductStatus(String desc) {

    }
    public String getDesc(){
        return desc;
    }
}
