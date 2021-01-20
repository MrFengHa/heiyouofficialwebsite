package com.heiyou.mapper;

import com.heiyou.entity.Case;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/20 17:11
 */
@Repository
public interface CaseMapper {

    /**
     * 查询所有
     * @return
     */
    List<Case> findAll();
}
