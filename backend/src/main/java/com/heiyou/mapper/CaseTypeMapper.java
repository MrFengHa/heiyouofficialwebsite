package com.heiyou.mapper;

import com.heiyou.entity.CaseType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/18 11:52
 */
@Repository
public interface CaseTypeMapper {
    /**
     * 查询所有案例类型
     * @return
     */
    List<CaseType> findAll();

    /**
     * 增加案例类型
     * @param caseType
     */
    void save(CaseType caseType);

    /**
     * 删除案例类型
     * @param id
     */
    void deleteCaseType(Integer id);
}
