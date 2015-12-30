package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.CityEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 游玩指南
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class PlayGuide implements Serializable {

    private static final long serialVersionUID = 452502101250329930L;

    @Expose
    private String id;

    /**
     * 城市CityEnum
     */
    @Expose
    private CityEnum city;

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

    /**
     * 摘要
     */
    @Expose
    private String summary;

    /**
     * 百度页码
     */
    @Expose
    private Integer baiduPage;
}
