package com.zjnu.androidbike.doamin;

import com.zjnu.androidbike.enums.GenderEnum;
import com.zjnu.androidbike.enums.RoleEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * 用户
 * 底层对象不关联外键
 * 注意：修改属性时候需要维护Dto
 */
@Data
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = -6996578842465803307L;

    private String id;

    /**
     * 头像FileInfo的download属性
     */
    private String headPortraitId;

    /**
     * 角色RoleEnum
     */
    private RoleEnum role;

    /**
     * 状态StatusEnum
     */
    private StatusEnum status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 登录名称
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称姓名
     */
    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别GenderEnum
     */
    private GenderEnum gender;

    /**
     * 电话
     */
    private String phoneNumber;

    /**
     * 电话短号
     */
    private String phoneShorter;

    /**
     * 身份证
     */
    private String identityCard;

    /**
     * 学号或工号
     */
    private String jobNumber;

    /**
     * 用户联系地址
     */
    private String contactAddr;

    /**
     * 邮编
     */
    private String zipcode;

    /**
     * 最近一次修改时间
     */
    private Date modifyTime;

    /**
     * 用户描述
     */
    private String description;

}
