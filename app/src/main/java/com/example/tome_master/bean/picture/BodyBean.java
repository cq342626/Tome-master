package com.example.tome_master.bean.picture;

import java.util.List;

/**
 * 时间 ：2017/11/16  10:03
 * 作者 ：陈奇
 * 作用 ：
 */
public class BodyBean<T> extends BaseBody{

    private int total;
    private int count;
    private List<T> data;


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


}
