package com.heiyou.mapper;

import com.heiyou.entity.CustomerWitness;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 客户见证持久层接口
 *
 * @Author 冯根源
 * @create 2021/2/8 10:05
 */
@Repository
public interface IntoBlackOilCustomerWitnessMapper {
    /**
     * 查询所有的客户信息
     * @return
     */
    List<CustomerWitness> selectAll();
}
