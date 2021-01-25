package com.heiyou.service;

import com.heiyou.entity.Information;

import java.util.List;

/**
 * 用户留言信息业务逻辑层接口
 *
 * @Author 冯根源
 * @create 2021/1/25 10:57
 */
public interface InformationService {
    /**
     * 查找所有
     * @return
     */
    List<Information> findAll();

    /**
     * 保存用户留言信息
     * @param information
     * @return
     */
    boolean save(Information information);
}
