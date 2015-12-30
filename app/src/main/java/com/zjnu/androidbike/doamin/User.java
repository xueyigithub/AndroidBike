package com.zjnu.androidbike.doamin;

import com.google.gson.annotations.Expose;
import com.zjnu.androidbike.enums.GenderEnum;
import com.zjnu.androidbike.enums.RoleEnum;
import com.zjnu.androidbike.enums.StatusEnum;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 * 底层对象不关联外键
 * 注意：修改属性时候需要维护Dto
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class User implements Serializable {

    private static final long serialVersionUID = -6996578842465803307L;

    @Expose
    private String id;

    /**
     * 头像FileInfo的download属性
     */
    @Expose
    private String headPortraitId;

    /**
     * 角色RoleEnum
     */
    @Expose
    private RoleEnum role;

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
     * 登录名称
     */
    @Expose
    private String userName;

    /**
     * 密码
     */
    @Expose
    private String password;

    /**
     * 邮箱
     */
    @Expose
    private String email;

    /**
     * 昵称姓名
     */
    @Expose
    private String nickName;

    /**
     * 真实姓名
     */
    @Expose
    private String realName;

    /**
     * 性别GenderEnum
     */
    @Expose
    private GenderEnum gender;

    /**
     * 电话
     */
    @Expose
    private String phoneNumber;

    /**
     * 电话短号
     */
    @Expose
    private String phoneShorter;

    /**
     * 身份证
     */
    @Expose
    private String identityCard;

    /**
     * 学号或工号
     */
    @Expose
    private String jobNumber;

    /**
     * 用户联系地址
     */
    @Expose
    private String contactAddr;

    /**
     * 邮编
     */
    @Expose
    private String zipcode;

    /**
     * 最近一次修改时间
     */
    @Expose
    private Date modifyTime;

    /**
     * 用户描述
     */
    @Expose
    private String description;

}
