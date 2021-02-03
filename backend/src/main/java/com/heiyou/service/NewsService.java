package com.heiyou.service;

import com.heiyou.entity.News;
import org.springframework.web.multipart.MultipartFile;

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
     * @param news 新闻
     * @param coverImage  封面
     * @return
     */
    boolean saveNews(News news, MultipartFile coverImage);

    /**
     * 根据ID新闻信息
     * @param news_id
     * @return
     */
    News findById(Integer news_id);

    /**
     * 保存新闻文章图片
     * @param image
     * @return
     */
    String saveNewsImage(MultipartFile image);

    /**
     * 根据新闻类型查找新闻信息
     * @param newsTypeName 新闻类型
     * @return
     */
    List<News> findByNewTypeName(String newsTypeName);
}
