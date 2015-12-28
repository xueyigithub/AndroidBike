package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.FileTypeEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * 文件信息
 * 底层对象不关联外键
 * 注意：修改属性时候需要维护Dto
 */
@Data
@Builder
public class FileInfo implements Serializable {

    private static final long serialVersionUID = -4943866506112002047L;

    @Expose
    private String id;

    /**
     * 下载外键
     */
    @Expose
    private String download;

    /**
     * 操作人User Id
     */
    @Expose
    private String operatorId;

    /**
     * 状态StatusEnum
     */
    @Expose
    private StatusEnum status;

    /**
     * 文件类型
     */
    @Expose
    private FileTypeEnum fileType;

    /**
     * 文件名称
     */
    @Expose
    private String filename;

    /**
     * ？？？
     */
    @Expose
    private List<String> aliases;

    /**
     * chunk数量
     */
    @Expose
    private Long chunkSize;

    /**
     * 创建时间
     */
    @Expose
    private Date uploadDate;

    /**
     * 大小
     */
    @Expose
    private Long length;

    /**
     * 文件类型
     */
    @Expose
    private String contentType;

    /**
     * MD5
     */
    @Expose
    private String md5;

}
