package com.heiyou.service.impl;

import com.heiyou.entity.CaseType;
import com.heiyou.mapper.CaseTypeMapper;
import com.heiyou.service.CaseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/18 12:20
 */
@Service
public class CaseTypeServiceImpl implements CaseTypeService {
    @Autowired
    CaseTypeMapper caseTypeMapper;
    /**
     * 查询所有案例类型
     *
     * @return
     */
    @Override
    public List<CaseType> findAll() {
        return caseTypeMapper.findAll();
    }

    /**
     * 添加案例类型
     *
     * @param caseType
     */
    @Override
    public void save(CaseType caseType) {
        caseTypeMapper.save(caseType);
    }
}
