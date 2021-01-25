package com.heiyou.controller;

import com.heiyou.entity.Information;
import com.heiyou.service.InformationService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 用户消息留言接口
 *
 * @Author 冯根源
 * @create 2021/1/25 10:35
 */
@Slf4j
@RestController
@RequestMapping("information")
@CrossOrigin
@Api(tags = "用户消息留言接口")
public class InformationController {
    @Autowired
    InformationService informationService;

    @ApiOperation("查询所有的用户留言信息")
    @GetMapping("getAllInformation")
    public Message getAllInformation() {
        try {
            List<Information> informationList = informationService.findAll();
            return Message.ok().data("informationList", informationList);
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error();
        }
    }

    @ApiOperation("添加用户留言信息")
    @PostMapping("addInformation")
    public Message addInformation(@RequestBody Information information){

        if (informationService.save(information)){
            return Message.ok();
        }else{
            return Message.error();
        }


    }
}
