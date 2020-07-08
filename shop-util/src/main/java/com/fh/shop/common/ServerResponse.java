package com.fh.shop.common;

public class ServerResponse<T> {

    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    private ServerResponse() {
    }

    private ServerResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ServerResponse success() {
        return new ServerResponse(200, "ok", null);
    }

    public static <T> ServerResponse<T> success(T data) {
        return new ServerResponse(200, "ok", data);
    }

    public static ServerResponse error() {
        return new ServerResponse(-1, "error", null);
    }

    public static ServerResponse error(int code, String msg) {
        return new ServerResponse(code, msg, null);

    }

    public static ServerResponse error(ResponseEnum responseEnum) {
        return new ServerResponse(responseEnum.getCode(), responseEnum.getMsg(), null);
    }

}
