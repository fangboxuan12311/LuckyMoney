package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
//@Component 经试验，该注释可以成功运行，且与@Service结果一致
public class LuckymoneyService {
    @Autowired
    private LuckymoneyRepository repository;//数据库对象

    /**
     * 事务 数据库事务
     * MySQL MyISM引擎不支持事务，应该选择InnoDB引擎
     */
    /**
     * 扣库存 创建订单 放到同一个事务里面
     */
    @Transient//多条事务要么同时成功，要么同时失败
    public void createTwo(){
        Luckymoney luckymoney1=new Luckymoney();
        luckymoney1.setProducer("习包子");
        luckymoney1.setMoney(new BigDecimal(250));
        repository.save(luckymoney1);

        Luckymoney luckymoney2=new Luckymoney();
        luckymoney2.setProducer("习包子");
        luckymoney2.setMoney(new BigDecimal(38));
        repository.save(luckymoney2);
    }
}
