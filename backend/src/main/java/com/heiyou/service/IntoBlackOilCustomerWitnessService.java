package com.heiyou.service;

import com.heiyou.entity.CustomerWitness;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
     *
     * @return
     */
    List<CustomerWitness> findAll();

    /**
     * 保存服务文本文件
     *
     * @param image
     * @return
     * @throws IOException
     */
    String saveCustomerWitnessImage(MultipartFile image) throws IOException;

    /**
     * 添加客户见证信息
     *
     * @param customerWitness
     * @param coverImage
     * @return
     */
    boolean saveCustomerWitness(CustomerWitness customerWitness, MultipartFile coverImage);

    /**
     * 删除客户见证信息
     *
     * @param customerWitness_id
     * @return
     */
    boolean deleteCustomerWitness(CustomerWitness customerWitness);

    /**
     * 根据客户见证ID查询文章
     * @param customerWitness_id
     * @return
     */
    CustomerWitness findById(Integer customerWitness_id);

    /**
     * 更新文章信息
     * @param customerWitness
     * @param coverImage
     * @return
     */
    boolean update(CustomerWitness customerWitness, MultipartFile coverImage);
}
