package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 地图导航
 */
@Data
@RequiredArgsConstructor
public class Navigation implements Serializable {

    private static final long serialVersionUID = -3067811187673375870L;

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
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

}
