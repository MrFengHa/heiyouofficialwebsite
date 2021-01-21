package com.heiyou.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 展示类型
 *
 * @Author 冯根源
 * @create 2021/1/20 16:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@ApiModel(value = "com.heiyou.entity.ExhibitionType",description = "展示类型")
public class ExhibitionType {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("展示类型名称")
    private String name;
    @ApiModelProperty("文件后缀名")
    private String suffix;
}
