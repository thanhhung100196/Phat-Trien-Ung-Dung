package com.example.shadow.quanlydiemsv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

import static com.example.shadow.quanlydiemsv.R.id.txtTenSV;

public class Thong_tin_sinh_vien extends AppCompatActivity implements Serializable {

    TextView txtMaSV;
    EditText edtTenSV;
    EditText edtGioiTinh;
    Bundle bundle;
    SinhVien sv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_sinh_vien);

        txtMaSV = (TextView) findViewById(R.id.txtMaSV1);
        edtTenSV = (EditText) findViewById(txtTenSV);
        edtGioiTinh = (EditText) findViewById(R.id.txtGT1);
        sv = new SinhVien();
        Intent intent = getIntent();
        bundle = intent.getBundleExtra("Sinh Viên");
        sv.setMaSoSinhVien( bundle.getString("MSSV"));
        sv.setHoTen(bundle.getString("Name"));
        sv.setGioiTinh(bundle.getString("Gender"));





        txtMaSV.setText(sv.getMaSoSinhVien());
        edtTenSV.setText(sv.getHoTen());
        edtGioiTinh.setText(sv.gioiTinh);

        Toast.makeText(Thong_tin_sinh_vien.this, "Load Thành Công.", Toast.LENGTH_SHORT).show();


    }


}
