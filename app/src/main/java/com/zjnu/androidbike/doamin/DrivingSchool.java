package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 驾校
 */
@Data
@RequiredArgsConstructor
public class DrivingSchool implements Serializable {

    private static final long serialVersionUID = -7623070889896794415L;

    private String id;

    /**
     * 操作人User
     */
    private User operator;

    /**
     * 图片List "FileInfo"
     */
    private List<FileInfo> images;

    /**
     * 标题图片 "FileInfo"
     */
    private FileInfo titleImage;

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