package com.heiyou.service.impl;

import com.heiyou.entity.NewsType;
import com.heiyou.mapper.NewsTypeMapper;
import com.heiyou.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    /**
     * 保存文章类型
     *
     * @param newsType
     * @return
     */
    @Override
    public boolean saveNewsType(NewsType newsType) {
        try {
            newsTypeMapper.insertNewsType(newsType);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 根据id查询文章类型
     *
     * @param newsType_id
     * @return
     */
    @Override
    public NewsType findById(Integer newsType_id) {
        return newsTypeMapper.selectById(newsType_id);
    }

    /**
     * 更新文章类型
     *
     * @param newsType
     * @return
     */
    @Override
    public boolean updateNewsType(NewsType newsType) {
        try {
            newsTypeMapper.updateNewsType(newsType);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
