package com.heiyou.service;

import com.heiyou.entity.ExhibitionType;

import java.util.List;

/**
 * 展示类型service接口
 *
 * @Author 冯根源
 * @create 2021/1/21 15:11
 */
public interface ExhibitionTypeService {

    /**
     * 查询展示类型
     * @return
     */
    List<ExhibitionType> readAll();
}
