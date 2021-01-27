package com.heiyou.service;

import com.heiyou.entity.News;

import java.util.List;

/**
 * 新闻业务逻辑层接口
 *
 * @Author 冯根源
 * @create 2021/1/27 15:35
 */
public interface NewsService {
    /**
     * 获取所有的新闻信息
     * @return
     */
    List<News> findAll();

    /**
     * 保存新闻
     * @param news
     * @return
     */
    boolean saveNews(News news);
}
