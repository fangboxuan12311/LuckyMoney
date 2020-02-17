package com.imooc.luckmoney;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component //使该类的对象可以被其他类引用，注入
@ConfigurationProperties(prefix = "limit")//在配置文件中，引用limit开头的字段
public class LimitConfig {
    private BigDecimal minMoney,maxMoney;//对象名称与配置文件中的limit对象保持一致
    private String description;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
