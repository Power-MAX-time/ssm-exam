package com.powernode.util;

/**
 * Company : 枚举  ：如果针对一个变量的取值只能在某一个范围下时，请使用枚举类型来定义。
 * Date : 2020/8/28
 * Description :
 */
/**
 * 枚举中定义的变量类型都是当前枚举对象类型\
 * 1.变量和变量之间使用逗号分开，最后一个变量使用分号结束
 * 2.枚举类就是一个普通的class类
 * 3.枚举类中是默认存在一个无参的构造函数
 */
public enum  ResultEnum {

    SUCCESS("success",200),
    NOT_FOUND("未找到数据",1004),
    FAILED("操作失败",1006),
    USER_IP_LIMIT("IP受限制",1005),
    USER_LOCK("账户被锁定",1005),
    USER_NOT_EXIT("账号错误或不存在",1005),
    USER_EXPIRETIME("账户过期",1005),
    USER_PASSWORD_ERROR("密码错误",1005),
    UNKNOWN_EXCEPTION("不知名的异常",1007),
    SEND_FAIL("验证码发送失败",1008),
    NOT_ACTIVITY("未选择市场活动",1008),
    CHECK_ERROR("验证码校验失败",1008);




    ResultEnum(String message,Integer code){
        this.message = message;
        this.code = code;
    }

    private String message;

    private Integer code;

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    // ResultEnum POST = new ResultEnum（）；

}
