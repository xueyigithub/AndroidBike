package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 骑行
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class Ride implements Serializable {

    private static final long serialVersionUID = -2315027308353652448L;

    @Expose
    private String id;

    /**
     * 操作人User
     */
    @Expose
    private User operator;

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

}
