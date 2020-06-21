package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class riwayat extends AppCompatActivity {
    TextView tv_nama,tv_organisasi, tv_tgl,tv_peserta;
    String nama,organisasi,tgl, peserta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        tv_nama = (TextView) findViewById(R.id.tv_nama);
        tv_organisasi = (TextView) findViewById(R.id.tv_organisasi);
        tv_tgl=(TextView)findViewById(R.id.tv_tgl);
        tv_peserta=(TextView) findViewById(R.id.tv_peserta);

        if(getIntent().getStringExtra("nama") != null){
            nama = getIntent().getStringExtra("nama");
            tv_nama.setText(nama);
        }
        if(getIntent().getStringExtra("organisasi") != null){
            organisasi= getIntent().getStringExtra("organisasi");
            tv_organisasi.setText(organisasi);
        }
        if(getIntent().getStringExtra("tgl") != null){
            tgl = getIntent().getStringExtra("tgl");
            tv_tgl.setText(tgl);
        }
        if(getIntent().getStringExtra("peserta") != null){
            peserta = getIntent().getStringExtra("peserta");
            tv_peserta.setText(peserta);
        }

    }
}
