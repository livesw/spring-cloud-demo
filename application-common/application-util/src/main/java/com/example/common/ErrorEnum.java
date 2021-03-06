/*
 * 文 件 名:  ErrorEnum.java
 * 版    权:  Copyright 2017 南京云蜗信息技术有限公司,  All rights reserved
 * 描    述:  业务常量类
 * 版    本： <1.0.0> 
 * 创 建 人:  Huang Hao
 * 创建时间:  2017年12月11日
 */
package com.example.common;

import org.apache.commons.lang3.StringUtils;

/**
 * 错误枚举类 
 * 错误长度定为6位，前两位表示模块，后四位表示具体的错误类型，同一模块的错误码唯一 
 * @author  Huang Hao
 * @version  [1.0.0, 2017年12月11日]
 * @since  [蜗蜗生活/公共模块]
 */
public enum ErrorEnum
{
    /** 公共返回码以00开头，例如：000001  begin **/
    E_000000("000000", "请求成功"),
    E_000001("000001", "请求参数不能为空"),
    E_000002("000002", "请求参数长度错误"),
    E_000003("000003", "用户token已经过期或者不存在！"),
    E_000004("000004", "请求参数值错误"),
    E_000006("000006", "开始时间不能大于结束时间"),
    E_000007("000007", "日期格式转换错误"),
    E_000008("000008", "日期只支持查询6+1个月内的数据"),
    E_000009("000009", "时间跨度最大支持查询31天"),
    E_000010("000010", "解析时间出错"),
    E_000011("000011", "邮箱地址格式不正确"),
    E_000012("000012", "IP地址格式不正确"),
    E_000013("000013", "手机号码格式不正确！"),
    E_000014("000014", "日期格式不正确！"),
    E_000015("000015", "时间格式不正确！"),
    E_000016("000016", "手机号码或者座机格式不正确！"),
    E_000017("000017", "您的身份证号输入不正确！"),
    
    /*********系统异常,以99开头***********/
    E_990001("990001", "请检查服务是否启动！"),
    E_999997("999997", "业务处理异常,不支持emoji输入！"),
    E_999998("999998", "系统请求异常,请检查入参格式!"),
    E_999999("999999", "业务处理异常！"),
    
    /***********短信模块异常，以20开头***************/
    E_200001("200001", "短信发送过于频繁，请稍后再试！"),
    E_200002("200002", "短信发送失败！"),
    E_200003("200003", "消息推送失败！"),
    E_200004("200004", "推送人为空！"),
    E_200006("200006", "不能推送给自己！"),
    E_200005("200005", "获取短信模板失败！"),
    
    /**********用户模块，以01开头**********/
    E_010000("010000", "手机号码已被注册！"),
    E_010001("010001", "手机号码未注册！"),
    E_010002("010002", "手机号码已被禁止登录，请联系客服！"),
    E_010003("010003", "验证码不存在或者已经过期，请重试！"),
    E_010004("010004", "验证码不正确！"),
    E_010005("010005", "您已经提交注册请求,请勿多次点击哦！"),
    E_010006("010006", "邀请码输入错误，请检查后重新输入！"),
    E_010007("010007", "您输入的密码不正确，请重新输入！"),
    E_010008("010008", "登出失败,请检查请求参数！"),
    E_010009("010009", "会话失效，请重新获取短信验证码！"),
    E_010010("010010", "user_token为空！"),
    E_010011("010011", "用户信息为空！"),
    E_010012("010012", "您的地址数量已经爆表！"),
    E_010013("010013", "地址id不能为空！"),
    E_010014("010014", "地址信息不存在！"),
    E_010015("010015", "请求操作收藏参数不存在！"),
    E_010016("010016", "操作过快，请稍等片刻！"),
    E_010017("010017", "查询数量已超出上限！"),
    E_010018("010018", "当前不存在实名认证信息，无法修改！"),
    E_010019("010019", "您的实名认证信息已审核通过，无法修改！"),
    E_010020("010020", "您的实名认证信息正在审核中，无法修改，请耐心等候！"),
    E_010021("010021", "您当前已存在提交的实名认证信息，请勿重复提交！"),
    E_010022("010022", "您当前已提交的身份证号已经存在，请检查是否输入正确！"),
    E_010023("010023", "您提交的身份证图片信息已失效或者数据有误，请重新上传！"),
    E_010024("010024", "您要修改的用户实名认证信息不存在！"),
    E_010025("010025", "服务id不能为空！"),
    E_010026("010026", "商家信息不存在！"),
    E_010027("010027", "openId、unionId为空！"),
    E_010028("010028", "微信号已经被其它账号绑定！"),
    E_010029("010029", "您已经绑定了邀请码，请勿重复绑定！"),
    E_010030("010030", "月数量不能小于等于0"),
    E_010031("010031", "请求来源不正确"),
    E_010032("010032", "关联订单号已经存在"),
    E_010033("010033", "请勿绑定自己的邀请码"),
    E_010034("010034", "您自己不能关注自己哦"),
    E_010035("010035", "重复增加积分"),
    /**********营销-薅羊毛，以02开头**********/
    E_020000("020000", "任务列表信息不存在！"),
    E_020001("020001", "当前任务已下线，请重新刷新加载任务列表"),
    E_020002("020002", "该任务已经完成！"),
    E_020003("020003", "不支持签到！"),
    E_020004("020004", "只支持签到任务！"),
    E_020005("020005", "已签到，请勿重复签到！"),
    E_020006("020006", "地区数据不存在！"),
    
    /**********首页，以05开头**********/
    E_050000("050000", "当前定位为省级别,请获取精确定位"),
    /*************生活服务，以06开头*****************/
    E_060000("060000", "当前服务已下线"),
    E_060001("060001", "当前新闻已下线"),
    E_060002("060002", "地区为空！"),
    E_060003("060003", "当前商家已下线！"),
    E_060004("060004", "用户没有实名认证！"),
    
    /*************文件处理，以07开头*****************/
    E_070000("070000", "上传文件为空！"),
    E_070001("070001", "上传图片类别不存在"),
    E_070002("070002", "请求方式不是POST！"),
    E_070003("070003", "您上传的文件太大，请重新选择！"),
    E_070004("070004", "后缀错误！"),
    
    /*************视频模块，以08开头*****************/
    E_080000("080000", "该视频不存在或者已下线！"),
    E_080001("080001", "您不能删除其他人的视频哦~"),
    /**返回,10开头*********/
    E_100000("100000", "未查到任何数据"),
    E_100001("100001", "数据插入失败"),
    
    /*************H5活动模块，以09开头*****************/
    E_090000("090000", "您还不是VIP用户，无法领取，请前往充值！"),
    E_090001("090001", "您没有领取次数，请前往充值！"),
    E_090002("090002", "活动期间充值一年会员可获得一次领取机会哦！"),
    E_090003("090003", "您填写的领取信息已失效，请重新填写！"),
    

    /*********************userVipCard**********************/
    E_090010("090010", "兑换码不能为空！"),
    E_090011("090011", "您输入的兑换码无效！"),
    E_090012("090012", "您输入的兑换码已被使用！"),
    E_090013("090013", "请输入正确的兑换码 ！");
    // 成员变量
    private String code;
    
    private String message;
    
    // 构造方法
    private ErrorEnum(String code, String message)
    {
        this.code = code;
        this.message = message;
    }
    
    // 普通方法
    public static String getErrorMsg(String code)
    {
        for (ErrorEnum c : ErrorEnum.values())
        {
            if (StringUtils.equals(c.getCode(), code))
            {
                return c.message;
            }
        }
        return null;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String message)
    {
        this.message = message;
    }
}
