package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

/**
 * 课程表
 */
@Data
@Builder
public class Schedule implements Serializable {

    private static final long serialVersionUID = -2518301601309093390L;

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
     * 标题
     */
    @Expose
    private String title;

    /**
     * 星期X课程表
     * 里层Map 1-15表示第几节课
     */
    @Expose
    private Map<Integer, String> lessonOne;

    /**
     * 星期X课程表
     */
    @Expose
    private Map<Integer, String> lessonTwo;

    /**
     * 星期X课程表
     */
    @Expose
    private Map<Integer, String> lessonThree;

    /**
     * 星期X课程表
     */
    @Expose
    private Map<Integer, String> lessonFour;

    /**
     * 星期X课程表
     */
    @Expose
    private Map<Integer, String> lessonFive;

    /**
     * 星期X课程表
     */
    @Expose
    private Map<Integer, String> lessonSix;

    /**
     * 星期X课程表
     */
    @Expose
    private Map<Integer, String> lessonSeven;

}
