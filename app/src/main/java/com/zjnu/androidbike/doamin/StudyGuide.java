package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 就业指南
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class StudyGuide implements Serializable {

    private static final long serialVersionUID = -6158949383481295192L;

    @Expose
    private String id;

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
     * 浙师大网站的创建时间
     */
    @Expose
    private Date originalTime;

    /**
     * 标题
     */
    @Expose
    private String title;

    /**
     * 内容
     */
    @Expose
    private String content;

    /**
     * 工作城市
     */
    @Expose
    private String workCity;
}
