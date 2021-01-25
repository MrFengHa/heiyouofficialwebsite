package com.heiyou.service.impl;

import com.heiyou.entity.Information;
import com.heiyou.mapper.InformationMapper;
import com.heiyou.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/25 10:58
 */
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationMapper informationMapper;

    /**
     * 查找所有
     *
     * @return
     */
    @Override
    public List<Information> findAll() {
        return informationMapper.selectAll();
    }

    /**
     * 保存用户留言信息
     *
     * @param information
     * @return
     */
    @Override
    public boolean save(Information information) {

        try {
            informationMapper.insert(information);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }
}
