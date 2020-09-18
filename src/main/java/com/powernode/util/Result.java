package com.powernode.util;


import com.powernode.exception.ResultException;

/**统一结果类
 * Company : BJPowernode
 * Date : 2020/8/28
 * Description :
 */
public class Result {
    private String message;

    private Integer code;

    private Object data;

    public Result(Object data) {
        this.message = "success";
        this.code = 200;
        this.data = data;
    }

    public Result() {
        this.message = "success";
        this.code = 200;
    }

    public Result(String message, Integer code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }


    public Result(String message, Integer code) {
        this.message = message;
        this.code = code;
    }



    public static Result ok(Object data){
        return new Result(data);
    }
    public static Result ok(){
        return new Result();
    }


    public static Result ok(String message, Integer code){

        return new Result(message,code);
    }



    public static Result build(String message, Integer code){
        return new Result(message,code);
    }


    public static Result build(ResultException execption){
        return new Result(execption.getMessage(),execption.getCode());
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
