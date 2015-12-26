package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 操作日志
 */
@Data
@RequiredArgsConstructor
public class ManipulateLog implements Serializable {

    private static final long serialVersionUID = 6523931250661464934L;

    private String id;

    /**
     * 操作人User
     */
    private User operator;

    /**
     * 状态StatusEnum
     */
    private StatusEnum status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 方法名称
     */
    private String methodName;

    /**
     * 方法类型
     */
    private String methodType;

    /**
     * 数据
     */
    private String methodData;

}
