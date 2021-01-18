package com.heiyou.service;

import com.heiyou.entity.CaseType;
import java.util.List;

/**
 * 案例类型service
 *
 * @Author 冯根源
 * @create 2021/1/18 12:16
 */

public interface CaseTypeService {
    /**
     * 查询所有案例类型
     * @return
     */
   List<CaseType> findAll();

    /**
     * 添加案例类型
     * @param caseType
     */
    void save(CaseType caseType);
}
