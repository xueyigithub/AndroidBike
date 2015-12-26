package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 失误招领
 */
@Data
@RequiredArgsConstructor
public class LostAndFound implements Serializable {

    private static final long serialVersionUID = -5429446501180027845L;

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
