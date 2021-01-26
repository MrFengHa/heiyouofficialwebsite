package com.heiyou.mapper;

import com.heiyou.entity.NewsType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文章类型持久层接口
 *
 * @Author 冯根源
 * @create 2021/1/26 14:38
 */
@Repository
public interface NewsTypeMapper {
    /**
     * 查询所有文章类型
     * @return
     */
    List<NewsType> selectAll();

    /**
     * 保存文章类型
     * @param newsType
     */
    void insertNewsType(NewsType newsType);
}
