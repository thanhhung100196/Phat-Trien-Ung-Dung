package com.example.shadow.quanlydiemsv;

/**
 * Created by Shadow on 10/8/2016.
 */

public class DiemSinhVien extends  SinhVien{


    public  int diemThuongKi;
    public  int diemGiuaKi;
    public  int diemCuoiKi;
    public  MonHoc maMon;

    public DiemSinhVien() {
    }

    public DiemSinhVien(String maSoSinhVien, String hoTen, String lopHoc, String gioiTinh, MonHoc maMon) {
        super(maSoSinhVien, hoTen, lopHoc, gioiTinh);
        this.maMon = maMon;
    }


}
