package com.heiyou.service.impl;

import com.heiyou.entity.NewsType;
import com.heiyou.mapper.NewsTypeMapper;
import com.heiyou.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/26 14:36
 */
@Service
public class NewsTypeServiceImpl implements NewsTypeService {

    @Autowired
    private NewsTypeMapper newsTypeMapper;

    /**
     * 查询所有文章类型
     *
     * @return
     */
    @Override
    public List<NewsType> findAll() {
        return newsTypeMapper.selectAll();
    }
}
