package com.heiyou.mapper;

import com.heiyou.entity.Case;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 案例数据操作层接口
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

    /**
     * 将数据保存到数据库
     * @param c
     */
    void save(Case c);

    /**
     * 根据id珊瑚案例
     * @param id
     */
    void delete(Integer id);
}
