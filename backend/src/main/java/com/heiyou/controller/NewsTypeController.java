package com.heiyou.controller;

import com.heiyou.entity.NewsType;
import com.heiyou.service.NewsTypeService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章类型控制接口
 *
 * @Author 冯根源
 * @create 2021/1/26 14:19
 */
@Slf4j
@RestController
@RequestMapping("newType")
@CrossOrigin
@Api(tags = "新闻类型接口")
public class NewsTypeController {

    @Autowired
    NewsTypeService newsTypeService;

    @ApiOperation("获取所有的文章类型")
    @GetMapping("getAllNewType")
    public Message getAllNewType(){

       try {
           List<NewsType> newsTypeList = newsTypeService.findAll();
           return  Message.ok().data("newTypeList", newsTypeList);
       }catch (Exception e){
           e.printStackTrace();
           return Message.error();
       }

    }

    @ApiOperation("保存新闻类型")
    @PostMapping("saveNewsType")
    public Message saveNewsType(@RequestBody NewsType newsType){
        System.out.println(newsType);
        if (newsType.getNewsType_name()==null||newsType.getNewsType_name().equals("")){
            return  Message.error().message("数据没有传输");
        }
       if (newsTypeService.saveNewsType(newsType)){
           return Message.ok();
       }else {
           return Message.error();
       }
    }
}
