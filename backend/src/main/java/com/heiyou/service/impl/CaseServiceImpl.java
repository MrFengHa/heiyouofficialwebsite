package com.heiyou.service.impl;

import com.heiyou.entity.Case;
import com.heiyou.entity.ExhibitionType;
import com.heiyou.mapper.CaseMapper;
import com.heiyou.mapper.ExhibitionTypeMapper;
import com.heiyou.service.CaseService;
import com.heiyou.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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

    @Autowired
    ExhibitionTypeMapper exhibitionTypeMapper;
    @Value("${myserviceres.path}")
    String serviceResPath;


    /**
     * 查询所有案例
     *
     * @return
     */
    @Override
    public List<Case> findAll() {
        return caseMapper.findAll();
    }

    /**
     * 保存
     *
     * @param c
     */
    @Override
    public boolean save(Case c, MultipartFile[] files) {
        File tempFile = new File(serviceResPath + "case/" + c.getName() + "/");
        try {
            FileUtil.createDir(tempFile);
            //将数据保存到数据库
            caseMapper.save(c);
            //根据展示类型id查找
            ExhibitionType exhibitionType = exhibitionTypeMapper.readById(c.getExhibitionTypeId());
            //保存文件
            for (int i = 0; i < files.length; i++) {
                files[i].transferTo(new File(tempFile + ("/" + (i + 1) + exhibitionType.getSuffix())));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            FileUtil.deleteDir(tempFile);
            return false;
        }

    }


}
