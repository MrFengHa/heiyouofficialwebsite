package com.heiyou.service.impl;

import com.heiyou.entity.Case;
import com.heiyou.mapper.CaseMapper;
import com.heiyou.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 案例服务层实现类
 *
 * @Author 冯根源
 * @create 2021/1/20 17:04
 */

@Service
public class CaseServiceImpl implements CaseService {
    @Autowired
    CaseMapper caseMapper;
    /**
     * 查询所有案例
     *
     * @return
     */
    @Override
    public List<Case> findAll() {
        return caseMapper.findAll();
    }
}
