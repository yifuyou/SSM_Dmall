package com.yifuyou.pro.response;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
/*
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;*/

import java.io.Serializable;


//保证序列化json 的时候，如果是null的对象看，key也会消失
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude( JsonInclude.Include.NON_NULL)
public class ServiceResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private ServiceResponse(int status) {
        this.status = status;
    }

    private ServiceResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServiceResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ServiceResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    @JsonIgnore
    //使之不在序列号结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }
    public int getStatus(){
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public static <T> ServiceResponse<T>createBySuccess(){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServiceResponse<T>createBySuccessMassage(String msg){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ServiceResponse<T>createBySuccess(T data){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }
    public static <T> ServiceResponse<T>createBySuccess(String msg,T data){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    public static <T> ServiceResponse<T>createByError(){
        return new ServiceResponse<T>(ResponseCode.ERROR.getCode());
    }
    public static <T> ServiceResponse<T>createByErrorMessage(String errorMsg){
        return new ServiceResponse<T>(ResponseCode.ERROR.getCode(),errorMsg);
    }

    public static <T> ServiceResponse<T>createByErrorCodeMessage(int errorCode,String errorMsg){
        return new ServiceResponse<T>(errorCode,errorMsg);
    }



}
