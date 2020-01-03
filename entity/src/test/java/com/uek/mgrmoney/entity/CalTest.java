package com.uek.mgrmoney.entity;

import org.junit.Test;

import java.math.BigDecimal;

public class CalTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }
    @Test
    public void test(){
        BigDecimal a = BigDecimal.valueOf(0.05);
        BigDecimal b = BigDecimal.valueOf(0.01);
        BigDecimal add = a.add(b);
        System.out.println(add.doubleValue());
    }
    @Test
    public void test1(){
        BigDecimal a = BigDecimal.valueOf(0.05);
        BigDecimal b = BigDecimal.valueOf(0.01);
        BigDecimal sub = a.subtract(b);
        System.out.println(sub.doubleValue());
    }

}
