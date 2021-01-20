package com.heiyou.controller;

import com.heiyou.entity.Case;
import com.heiyou.service.CaseService;
import com.heiyou.utils.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/20 16:44
 */
@Slf4j
@RestController
@RequestMapping("case")
@CrossOrigin
public class CaseController {

    @Autowired
    CaseService caseService;
    @GetMapping("findAll")
    public Message findAll(){
        try {
            List<Case> caseList = caseService.findAll();
            return  Message.ok().data("caseList",caseList);
        }catch (Exception e){
            e.printStackTrace();
            return  Message.error();
        }


    }
}
