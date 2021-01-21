package com.heiyou.controller;

import com.heiyou.entity.Case;
import com.heiyou.service.CaseService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
@Api(tags = "案例接口")
public class CaseController {

    @Autowired
    CaseService caseService;
    @ApiOperation("查询所有案例")
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

    @ApiOperation("添加案例信息")
    @PostMapping("createCase")
    public Message createCase(Case c, MultipartFile[] files){

            if( caseService.save(c,files)){
               return Message.ok();
            }else {
                return Message.error();
            }
    }

    @ApiOperation("删除案例信息")
    @PostMapping("deleteCase")
    public Message deleteCase(@RequestBody Case c){

        return Message.ok();
    }

}
