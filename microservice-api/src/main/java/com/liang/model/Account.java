package com.liang.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 15:44
 */
@Data
@Accessors(chain=true)
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
