package com.heiyou.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/26 14:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "com.heiyou.entity.NewType", description = "文章类型")
public class NewsType {
    @ApiModelProperty("文章类型id")
    private Integer newType_id;

    @ApiModelProperty("文章类型名称")
    private String newType_name;

    @ApiModelProperty("备注")
    private String newType_desc;

}
