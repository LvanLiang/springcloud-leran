package com.liang.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/27 21:20
 */
@Data
@Builder
public class Result {
    /**
     * 状态码
     */
    private int code;
    /**
     *信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;
}
