package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于接收数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptDTO {
    private Integer id;
    private String deptname;
}
