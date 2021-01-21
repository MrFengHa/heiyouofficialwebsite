package com.heiyou.service;

import com.heiyou.entity.Case;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/20 17:03
 */
public interface CaseService {
    /**
     * 查询所有案例
     * @return
     */
   List<Case> findAll();

    /**
     * 保存案例
     * @param c
     * @param files
     * @return
     */
   boolean save(Case c, MultipartFile[] files);

    /**
     * 删除案例信息
     * @param c
     * @return
     */
    boolean delete(Case c);
}
