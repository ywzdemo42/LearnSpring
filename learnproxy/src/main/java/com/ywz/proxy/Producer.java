package com.ywz.proxy;

/**
 * @autor yangdong
 * @time 2019/10/17 23:46
 * 一个生产者
 */
public class Producer implements IProducer{
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("收到" + money + "元");
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("售后服务" + money + "元");
    }
}
