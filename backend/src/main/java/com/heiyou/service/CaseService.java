package com.heiyou.service;

import com.heiyou.entity.Case;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/20 17:03
 */
public interface CaseService {
    /**
     * 查询所有案例
     * @return
     */
   List<Case> findAll();
}
