package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.NewsTypeEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * 校园新闻
 */
@Data
@Builder
public class CampusNews implements Serializable {

    private static final long serialVersionUID = 6542387358181251748L;

    private String id;

    /**
     * 图片List "FileInfo"
     */
    private List<FileInfo> images;

    /**
     * 标题图片 "FileInfo"
     */
    private FileInfo titleImage;

    /**
     * 类型NewsTypeEnum
     */
    private NewsTypeEnum newsType;

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

    /**
     * 摘要
     */
    private String summary;

    /**
     * borderId
     */
    private Long border;

}
