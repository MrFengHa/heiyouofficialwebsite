package com.heiyou.controller;

import com.heiyou.entity.News;
import com.heiyou.service.NewsService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 文章访问接口
 *
 * @Author 冯根源
 * @create 2021/1/27 14:59
 */
@Slf4j
@RestController
@RequestMapping("news")
@CrossOrigin
@Api(tags = "新闻接口")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @ApiOperation("获取所有的新闻")
    @GetMapping("getAllNews")
    public Message getAllNews() {
        try {
            List<News> newsList = newsService.findAll();
            return Message.ok().data("newsList", newsList);
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error();
        }
    }

    @ApiOperation("添加新闻")
    @PostMapping("saveNews")
    public Message saveNews(News news, @RequestParam("coverImage") MultipartFile coverImage) {
        if (newsService.saveNews(news, coverImage)) {
            return Message.ok();
        } else {
            return Message.error();
        }

    }

    @ApiOperation("根据ID查询新闻信息")
    @GetMapping("getNewsById")
    public Message getNewsById(Integer news_Id) {
        try {
            News news = newsService.findById(news_Id);
            return Message.ok().data("news", news);
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error();
        }
    }

}
