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
 * 客户见证实体类
 *
 * @Author 冯根源
 * @create 2021/2/8 9:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value="CustomerWitness", description="客户见证")
public class CustomerWitness {
    @ApiModelProperty("客户见证ID")
    private Integer customerWitness_Id;
    @ApiModelProperty(value = "客户见证标题",required = true)
    private String customerWitness_Title;
    @ApiModelProperty("客户见证封面")
    private String customerWitness_CoverUrl;
    @ApiModelProperty(value = "客户见证内容",required = true)
    private String customerWitness_Content;
    @ApiModelProperty("客户见证描述")
    private String customerWitness_Desc;
    @ApiModelProperty(value = "客户见证创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone="GMT+8")
    private Timestamp customerWitness_CreateTime;
}
