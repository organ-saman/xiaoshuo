package com.example.xiaoshuo.vo;

import java.io.Serializable;

public class JsonResult implements Serializable {
    private int state = 1;
    private String message = "ok";
    private Object date;

    public JsonResult(int state) {
        this.state = state;
    }

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(int state, String message, Object date) {
        this.state = state;
        this.message = message;
        this.date = date;
    }

    public JsonResult(Object date) {
        this.date = date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
