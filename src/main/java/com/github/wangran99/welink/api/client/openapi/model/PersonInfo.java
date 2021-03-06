package com.github.wangran99.welink.api.client.openapi.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PersonInfo {
    String corpUserId;          // 必须  员工ID，该用户在租户自身系统的登录标识，用于认证和邮箱登录（客户内唯一）   ---- 皮东泽 说这个参数客户提供不了， 通过手机号码获取
    String userNameCn;          // 必须  员工中文姓名
    String sex;                 //       性别。仅：M/F,  M: 男, F: 女
    String mobileNumber;        // 必须  手机号码
    List<String> corpDeptCode;  // 必须  客户侧部门唯一编码                                                  -----
    String userEmail;           //       邮箱
    String employeeId;          //       工号
    String landlineNumber;     //       座机
    String address;            //       办公位置信息
    String position;           //       员工职务字段信息
    String isOpenAccount;      // 必须。“0”：表示仅同步不开户；“1”：表示开户
    String remark;             //       备注信息
    String isHideMobileNumber; //       是否隐藏手机号码。1:公开（默认）；2：隐藏
    boolean isNotify;          //       在开户成功后，true:向员工发送短信/邮件通知(默认);false:不向员工发送短信/邮件通知
    String corpSecretary;      //       秘书。在导入用户时，如果秘书帐号还不存在，需要先维护秘书用户信息，再重新同步   ---- 提供不了, 暂不考虑
    String userNameEn;          //       员工英文名，未填写会由系统自动转为拼音                                  ---- 系统会生成， 不填写
    String mainCorpDept;        //      人员主部门，当为空时，默认取corpDeptCode部门信息第一个部门为人员主部门     ---- 系统会生成， 不填写
    Map extAttr;               //       {"自定义字段名称"：“自定义字段值”} ，必须是企业设置并存在的自定义字段      ---- 填写繁琐，非必要，暂不考虑
    Map orderInDepts;           //      {"1000": 1, "1001": 2, "1002": 3},                                  ---- 填写繁琐，非必要，暂不考虑

}
