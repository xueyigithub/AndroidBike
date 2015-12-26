package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 就业指南
 */
@Data
@RequiredArgsConstructor
public class StudyGuide implements Serializable {

    private static final long serialVersionUID = -6158949383481295192L;

    private String id;

    /**
     * 状态StatusEnum
     */
    private StatusEnum status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 浙师大网站的创建时间
     */
    private Date originalTime;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 工作城市
     */
    private String workCity;
}
