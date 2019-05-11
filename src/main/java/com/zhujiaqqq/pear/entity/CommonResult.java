package com.zhujiaqqq.pear.entity;

public class CommonResult<T> {
    private T data;
    private String errorMessage;
    private String errorCode;
    private Boolean success;

    public CommonResult(T data, String errorMessage, String errorCode, Boolean success) {
        this.data = data;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.success = success;
    }

    public CommonResult() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "data=" + data +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", success=" + success +
                '}';
    }
}
