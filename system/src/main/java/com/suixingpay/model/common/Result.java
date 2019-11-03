package com.suixingpay.model.common;

public class Result {

    private int code;
    private String message;
    private int adminId;

    public Result(int code, String message, int adminId) {
        this.code = code;
        this.message = message;
        this.adminId = adminId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
}
