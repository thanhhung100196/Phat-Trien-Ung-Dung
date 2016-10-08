package com.example.shadow.quanlydiemsv;

/**
 * Created by Shadow on 10/6/2016.
 */

public class MonHoc {
    public  String maMon;
    public  String tenMon;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
}
