package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * 操作日志
 */
@Data
@Builder
public class ManipulateLog implements Serializable {

    private static final long serialVersionUID = 6523931250661464934L;

    @Expose
    private String id;

    /**
     * 操作人User
     */
    @Expose
    private User operator;

    /**
     * 状态StatusEnum
     */
    @Expose
    private StatusEnum status;

    /**
     * 创建时间
     */
    @Expose
    private Date createTime;

    /**
     * 方法名称
     */
    @Expose
    private String methodName;

    /**
     * 方法类型
     */
    @Expose
    private String methodType;

    /**
     * 数据
     */
    @Expose
    private String methodData;

}
