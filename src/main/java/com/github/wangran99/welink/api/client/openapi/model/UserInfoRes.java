package com.github.wangran99.welink.api.client.openapi.model;

import java.util.Date;
import lombok.Data;


@Data
public class UserInfoRes {
    private String userStatus;      //状态, 1：未开户，2：开户中，3：已开户，4：已销户
    private String userId;      //用户帐号, Key值
    private String deptCode;                   //部门Id, Key值, 必填
    private String deptNameCn;
    private String deptNameEn;
    private String mobileNumber;     //绑定手机号码, 必填
    private String phoneNumber;    //手机号码
    private String landlineNumber;    //电话号码(座机)
    private String userNameCn;                //用户中文名称, 必填
    private String userNameEn;            //用户英文名称, 必填
    private String sex;                          //性别, 仅：M/F, M: 男, F: 女, 必填
    private String corpUserId;             //用户工号(集成用的字段，如果在开户时没有维护则为空)
    private String userEmail;   //用户邮箱, 必填
    private String secretary;   //秘书(用户帐号)
    private String address;              //地址
    private String remark;       //备注
    private Date creationTime;  //创建时间
    private Date lastUpdatedTime;
}
