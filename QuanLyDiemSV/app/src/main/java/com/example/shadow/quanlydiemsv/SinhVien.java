package com.example.shadow.quanlydiemsv;

import java.io.Serializable;

/**
 * Created by Shadow on 10/5/2016.
 */

public class SinhVien implements Serializable {
    public String maSoSinhVien;
    public  String hoTen;
    public String lopHoc;
    public String gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public SinhVien(String maSoSinhVien, String hoTen, String lopHoc, String gioiTinh) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSoSinhVien() {
        return maSoSinhVien;
    }

    public void setMaSoSinhVien(String maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
