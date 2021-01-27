package com.heiyou.service.impl;

import com.heiyou.entity.News;
import com.heiyou.mapper.NewsMapper;
import com.heiyou.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 新闻业务逻辑层实现类
 *
 * @Author 冯根源
 * @create 2021/1/27 15:35
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;
    /**
     * 获取所有的新闻信息
     *
     * @return
     */
    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }

    /**
     * 保存新闻
     *
     * @param news
     * @return
     */
    @Override
    public boolean saveNews(News news) {
        try {
            news.setNews_CreateTime(new Timestamp(new Date().getTime()));
            newsMapper.insertNews(news);
            return false;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
}
