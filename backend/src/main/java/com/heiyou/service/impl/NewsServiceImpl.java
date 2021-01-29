package com.heiyou.service.impl;

import com.heiyou.entity.News;
import com.heiyou.mapper.NewsMapper;
import com.heiyou.service.NewsService;
import com.heiyou.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;

/**
 * 新闻业务逻辑层实现类
 *
 * @Author 冯根源
 * @create 2021/1/27 15:35
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Value("${myserviceres.path}")
    String serviceResPath;

    /**
     * 获取所有的新闻信息
     *
     * @return
     */
    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }


    /**
     * 保存新闻
     *
     * @param news       新闻
     * @param coverImage 封面
     * @return
     */
    @Override
    public boolean saveNews(News news, MultipartFile coverImage) {
        //新闻存放的文件夹
        String newsDir = "news";
        //当前新闻的文件夹
        String currentNewDit = news.getNews_Title();
        //封面的文件名
        String coverImageFile = "coverImage.jpg";
        //文件要存放在本机的绝对路径
        File tempFile = new File(serviceResPath + "/" + newsDir + "/" + currentNewDit + "/");
        try {
            //如果没有改文件夹就创建文件夹
            FileUtil.createDir(tempFile);

            coverImage.transferTo(new File(tempFile + "/" + coverImageFile));
            //保存到数据库中的地址
            String dataPath = "/" + newsDir + "/" + currentNewDit + "/" + coverImageFile;
            news.setNews_CreateTime(new Timestamp(System.currentTimeMillis()));
            news.setNews_CoverUrl(dataPath);
            newsMapper.insertNews(news);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            FileUtil.deleteDir(tempFile);
            return false;
        }

    }

    /**
     * 根据ID新闻信息
     *
     * @param news_id
     * @return
     */
    @Override
    public News findById(Integer news_id) {
        return newsMapper.selectById(news_id);
    }
}
