package com.heiyou.controller;

import com.heiyou.entity.ExhibitionType;
import com.heiyou.service.ExhibitionTypeService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 展示类型
 *
 * @Author 冯根源
 * @create 2021/1/21 15:07
 */
@Slf4j
@RestController
@RequestMapping("exhibitionType")
@CrossOrigin
@Api(tags= "展示类型接口")
public class ExhibitionTypeController {
    @Autowired
    ExhibitionTypeService exhibitionTypeService;
    @ApiOperation("查询所有展示类型")
    @GetMapping("readAll")
    public Message readAll(){
    try {
        List<ExhibitionType> exhibitionTypeList = exhibitionTypeService.readAll();
        return Message.ok().data("exhibitionTypeList",exhibitionTypeList);
    }catch (Exception e){
        e.printStackTrace();
        return Message.error();
    }
    }
}
