package com.heiyou.service;

import com.heiyou.entity.NewsType;

import java.util.List;

/**
 * 文章类型业务逻辑层接口
 *
 * @Author 冯根源
 * @create 2021/1/26 14:34
 */
public interface NewsTypeService {

    /**
     * 查询所有文章类型
     * @return
     */
    List<NewsType> findAll();

    /**
     * 保存文章类型
     * @param newsType
     * @return
     */
    boolean saveNewsType(NewsType newsType);

    /**
     * 根据id查询文章类型
     * @param newsType_id
     * @return
     */
    NewsType findById(Integer newsType_id);

    /**
     * 更新文章类型
     * @param newsType
     * @return
     */
    boolean updateNewsType(NewsType newsType);
}
