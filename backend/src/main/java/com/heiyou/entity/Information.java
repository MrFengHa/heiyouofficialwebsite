package com.heiyou.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 用户消息留言实体类
 *
 * @Author 冯根源
 * @create 2021/1/25 10:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@ApiModel(value = "com.heiyou.entity.Information", description = "用户消息留言实体类")
public class Information {
    @ApiModelProperty("主键ID")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("联系电话")
    private String phoneNumber;
    @ApiModelProperty("备注")
    private String desc;
}
