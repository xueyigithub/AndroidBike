package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.FileTypeEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 文件信息
 * 底层对象不关联外键
 * 注意：修改属性时候需要维护Dto
 */
@Data
@RequiredArgsConstructor
public class FileInfo implements Serializable {

    private static final long serialVersionUID = -4943866506112002047L;

    private String id;

    /**
     * 下载外键
     */
    private String download;

    /**
     * 操作人User Id
     */
    private String operatorId;

    /**
     * 状态StatusEnum
     */
    private StatusEnum status;

    /**
     * 文件类型
     */
    private FileTypeEnum fileType;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * ？？？
     */
    private List<String> aliases;

    /**
     * chunk数量
     */
    private Long chunkSize;

    /**
     * 创建时间
     */
    private Date uploadDate;

    /**
     * 大小
     */
    private Long length;

    /**
     * 文件类型
     */
    private String contentType;

    /**
     * MD5
     */
    private String md5;

}
