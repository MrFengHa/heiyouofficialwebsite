package com.heiyou.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 案例实体类
 *
 * @Author 冯根源
 * @create 2021/1/20 16:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@ApiModel(value ="com.heiyou.entity.Case",description ="案例实体类")
public class Case {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("案例名称")
    private String name;
    @ApiModelProperty("案例类型id")
    private Integer caseTypeId;
    @ApiModelProperty("案例类型")
    private CaseType caseType;
    @ApiModelProperty("展示类型id")
    private Integer exhibitionTypeId;
    @ApiModelProperty("展示类型")
    private ExhibitionType exhibitionType;
}
