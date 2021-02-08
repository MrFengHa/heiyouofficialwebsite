package com.heiyou.service.impl;

import com.heiyou.entity.CustomerWitness;
import com.heiyou.mapper.IntoBlackOilCustomerWitnessMapper;
import com.heiyou.service.IntoBlackOilCustomerWitnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户见证业务逻辑层实现类
 *
 * @Author 冯根源
 * @create 2021/2/8 10:03
 */
@Service
public class IntoBlackOilCustomerWitnessServiceImpl implements IntoBlackOilCustomerWitnessService {
    @Autowired
    private IntoBlackOilCustomerWitnessMapper intoBlackOilCustomerWitnessMapper;
    /**
     * 查询所有的客户见证的信息
     *
     * @return
     */
    @Override
    public List<CustomerWitness> findAll() {
        return intoBlackOilCustomerWitnessMapper.selectAll();
    }
}
