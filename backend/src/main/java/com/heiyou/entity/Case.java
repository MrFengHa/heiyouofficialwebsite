package com.heiyou.entity;

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
public class Case {
    private Integer id;
    private String name;
    private Integer caseTypeId;
    private CaseType caseType;
    private Integer exhibitionTypeId;
    private ExhibitionType exhibitionType;
}
