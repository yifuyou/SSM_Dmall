package com.yifuyou.pro.response;

public enum  ResponseCode {

    SUCCESS(200, "SUCCESS"),
    ERROR(400, "BAD REQUEST"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    INTERNAL_SERVER_ERROR(403, "INTERNAL SERVER ERROR");
    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code=code;
        this.desc=desc;
    }
    public int getCode(){
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
