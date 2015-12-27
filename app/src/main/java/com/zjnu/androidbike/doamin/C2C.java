package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * C2C交易
 */
@Data
@Builder
public class C2C implements Serializable {

    private static final long serialVersionUID = 4071572746652102919L;

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
