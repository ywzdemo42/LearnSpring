package com.ywz.proxy;

/**
 * @autor yangdong
 * @time 2019/10/17 23:51
 */
public interface IProducer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
