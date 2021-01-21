package com.heiyou.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 案例类型实体类
 * @Author 冯根源
 * @create 2021/1/18 11:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@ApiModel(value = "com.heiyou.entity.CaseType",description = "案例类型实体类")
public class CaseType {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "中文名称")
    private String cnName;
    @ApiModelProperty(value = "英文名称")
    private String enName;
}
