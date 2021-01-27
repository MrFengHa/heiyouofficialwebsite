package com.heiyou.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * 新闻实体类
 *
 * @Author 冯根源
 * @create 2021/1/27 11:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value="News", description="新闻")
public class News {
    @ApiModelProperty("新闻ID")
    private Integer news_Id;

    @ApiModelProperty(value = "新闻标题",required = true)
    private String news_Title;
    @ApiModelProperty("新闻封面")
    private String news_CoverUrl;
    @ApiModelProperty(value = "新闻内容",required = true)
    private String news_Content;
    @ApiModelProperty("新闻描述")
    private String news_Desc;
    @ApiModelProperty(value = "新闻类型ID",required = true)
    private String newsType_id;
    @ApiModelProperty(value = "新闻创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone="GMT+8")
    private Timestamp news_CreateTime;
    @ApiModelProperty(value = "新闻类型")
    private NewsType newsType;

}
