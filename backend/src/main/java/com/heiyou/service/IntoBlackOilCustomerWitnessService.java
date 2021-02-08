package com.heiyou.service;

import com.heiyou.entity.CustomerWitness;

import java.util.List;

/**
 * 客户见证业务逻辑层接口
 *
 * @Author 冯根源
 * @create 2021/2/8 9:49
 */
public interface IntoBlackOilCustomerWitnessService {
    /**
     * 查询所有的客户见证的信息
     * @return
     */
    List<CustomerWitness> findAll();
}
