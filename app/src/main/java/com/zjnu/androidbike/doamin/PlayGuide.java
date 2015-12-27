package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.CityEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * 游玩指南
 */
@Data
@Builder
public class PlayGuide implements Serializable {

    private static final long serialVersionUID = 452502101250329930L;

    private String id;

    /**
     * 城市CityEnum
     */
    private CityEnum city;

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

    /**
     * 摘要
     */
    private String summary;

    /**
     * 百度页码
     */
    private Integer baiduPage;
}
