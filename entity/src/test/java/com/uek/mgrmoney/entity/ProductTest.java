package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeratmtion.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;


public class ProductTest {
    private static Logger logger = Logger.getLogger(ProductTest.class);
    @Test
    public void createProduct(){
        Product p = new Product();
        p.setId("T001");
        p.setName("月光带");
        p.setStartAmount(BigDecimal.valueOf(1000));
        p.setStatus(ProductStatus.SALING);
        p.setCreateAt(new Date());
        p.setCreateUser("李四");

        logger.info(p);
    }
}
