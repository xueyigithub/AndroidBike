package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.NewsTypeEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 校园新闻
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class CampusNews implements Serializable {

    private static final long serialVersionUID = 6542387358181251748L;

    @Expose
    private String id;

    /**
     * 图片List "FileInfo"
     */
    @Expose
    private List<FileInfo> images;

    /**
     * 标题图片 "FileInfo"
     */
    @Expose
    private FileInfo titleImage;

    /**
     * 类型NewsTypeEnum
     */
    @Expose
    private NewsTypeEnum newsType;

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
     * 内容
     */
    @Expose
    private String content;

    /**
     * 摘要
     */
    @Expose
    private String summary;

    /**
     * borderId
     */
    @Expose
    private Long border;

}
