package com.heiyou.mapper;

import com.heiyou.entity.News;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 新闻持久层接口
 *
 * @Author 冯根源
 * @create 2021/1/27 15:37
 */
@Repository
public interface NewsMapper {
    /**
     * 查询所有的
     * @return
     */
    List<News> selectAll();

    /**
     * 保存新闻
     * @param news
     */
    void insertNews(News news);


    /**
     * 根据ID查找新闻
     * @param news_id
     * @return
     */
    News selectById(Integer news_id);
}
