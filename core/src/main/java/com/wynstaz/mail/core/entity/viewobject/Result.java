package com.wynstaz.mail.core.entity.viewobject;

/**
 * 统一返回结果
 *
 * @author: wyn
 * @Date: 2018/10/18 14:39
 */
public class Result {
    private static final Integer SUCCESS_STATUS = 200;
    private static final Integer FAILURE_STATUS = 400;
    private static final Integer INTERNAL_ERROR_STATUS = 500;
    private static final String SUCCESS_MESSAGE = "success";
    private static final String FAILURE_MESSAGE = "failure";
    private static final String INTERNAL_ERROR_MESSAGE = "internal error";
    //状态
    private Integer status;

    //消息
    private String message;

    //数据
    private Object data;

    //构造方法
    private Result(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return SUCCESS_STATUS.equals(this.status);
    }

    public boolean notSuccess() {
        return !SUCCESS_STATUS.equals(this.status);
    }

    //无数据的成功结果
    public static Result success() {
        return new Result(SUCCESS_STATUS, SUCCESS_MESSAGE, null);
    }

    //有数据的成功结果
    public static Result success(Object data) {
        return new Result(SUCCESS_STATUS, SUCCESS_MESSAGE, data);
    }

    //无消息的失败结果
    public static Result failure() {
        return new Result(FAILURE_STATUS, FAILURE_MESSAGE, null);
    }

    //有消息的失败结果
    public static Result failure(String message) {
        return new Result(FAILURE_STATUS, message, null);
    }

    //无消息的内部异常结果
    public static Result internalError() {
        return new Result(INTERNAL_ERROR_STATUS, INTERNAL_ERROR_MESSAGE, null);
    }

    //有消息的内部异常结果
    public static Result internalError(String message) {
        return new Result(INTERNAL_ERROR_STATUS, message, null);
    }

    public static Result build(final boolean success, final Object data){
        if (success) {
            return new Result(SUCCESS_STATUS, SUCCESS_MESSAGE, data);
        }
        return Result.build(INTERNAL_ERROR_STATUS, FAILURE_MESSAGE, data);
    }
    //自定义构建结果
    public static Result build(Integer status, String message, Object data) {
        return new Result(status, message, data);
    }

    //设置和获取成员变量的方法
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}