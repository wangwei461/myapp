package com.ww.myapp.entity.rs;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "data")
public class ReturnData<T> {
    private T msg;
    private int length;
    private int current;
    private int page;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
