package com.heiyou.service.impl;

import com.heiyou.entity.ExhibitionType;
import com.heiyou.mapper.ExhibitionTypeMapper;
import com.heiyou.service.ExhibitionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/21 15:12
 */
@Service
public class ExhibitionTypeServiceImpl implements ExhibitionTypeService {
    @Autowired
    ExhibitionTypeMapper exhibitionTypeMapper;
    /**
     * 查询展示类型
     *
     * @return
     */
    @Override
    public List<ExhibitionType> readAll() {
        return exhibitionTypeMapper.readAll();
    }
}
