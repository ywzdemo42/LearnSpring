package com.ywz.domain;

import java.io.Serializable;

/**
 * @author yangdong
 * @creat 2019-10-21 10:12
 * @Description:TODO
 * 账户实体类
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Float money;

    public Account(Integer id, String name, Float money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Account() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }
}
