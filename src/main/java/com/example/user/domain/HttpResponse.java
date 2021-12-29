package com.example.user.domain;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public class HttpResponse {

    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String reason;
    private String message;
    private String timestamp;

    public HttpResponse() {
    }

    public HttpResponse(HttpStatus httpStatus, String message) {
        this.httpStatusCode = httpStatus.value();
        this.httpStatus = httpStatus;
        this.reason = httpStatus.getReasonPhrase();
        this.message = message;
        this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
