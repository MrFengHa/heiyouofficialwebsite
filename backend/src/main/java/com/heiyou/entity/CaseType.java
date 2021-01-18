package com.heiyou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 文件类型
 * @Author 冯根源
 * @create 2021/1/18 11:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class CaseType {
    private Integer id;
    private String cnName;
    private String enName;
}
