package com.heiyou.mapper;

import com.heiyou.entity.Information;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户留言信息持久层接口
 *
 * @Author 冯根源
 * @create 2021/1/25 10:59
 */
@Repository
public interface InformationMapper {
    /**
     * 查询所有的用户留言信息
     * @return
     */
    List<Information> selectAll();

    /**
     * 添加用户留言信息
     * @param information
     */
    void insert(Information information);
}
