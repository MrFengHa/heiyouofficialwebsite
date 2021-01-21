package com.heiyou.mapper;

import com.heiyou.entity.ExhibitionType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 展示类型持久层接口
 *
 * @Author 冯根源
 * @create 2021/1/21 15:13
 */
@Repository
public interface ExhibitionTypeMapper {
    /**
     * 查询所有展示类型
     * @return
     */
    List<ExhibitionType> readAll();

    /**
     * 根据id查找展示类型
     * @param exhibitionTypeId
     * @return
     */
    ExhibitionType readById(Integer exhibitionTypeId);

    ;
}
