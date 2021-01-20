package com.heiyou.entity;

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
public class ExhibitionType {
    private Integer id;
    private String name;
}
