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

    /**
     * 保存客户见证
     * @param customerWitness
     */
    void insertCustomerWitness(CustomerWitness customerWitness);

    /**
     * 删除客户见证信息
     * @param customerWitness_id
     */
    void deleteCustomerWitness(Integer customerWitness_id);

    /**
     * 根据id查询文章信息
     * @param customerWitness_id
     * @return
     */
    CustomerWitness findById(Integer customerWitness_id);
}
