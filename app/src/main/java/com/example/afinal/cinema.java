package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class cinema extends AppCompatActivity {
    ImageButton btn_pinjam;
    EditText et_nama,et_organisasi,et_tgl,et_peserta;
    String nama,organisasi,tgl, peserta,cinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cinema);

        btn_pinjam=(ImageButton) findViewById(R.id.btn_pinjam);
        et_nama=(EditText) findViewById(R.id.et_nama);
        et_organisasi=(EditText) findViewById(R.id.et_organisasi);
        et_tgl=(EditText) findViewById(R.id.et_tgl);
        et_peserta=(EditText) findViewById(R.id.et_peserta);

        btn_pinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama= et_nama.getText().toString();
                organisasi=et_organisasi.getText().toString();
                tgl=et_tgl.getText().toString();
                peserta=et_peserta.getText().toString();

                Intent i=new Intent(cinema.this,riwayat.class);
                if ((nama.equals(" ")||organisasi.equals(" ")|| tgl.equals(" ")||peserta.equals(" "))){
                    Toast.makeText(cinema.this,"Data Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
                }else{
                    i.putExtra("nama",nama);
                    i.putExtra("organisasi",organisasi);
                    i.putExtra("tgl",tgl);
                    i.putExtra("peserta",peserta);
                    startActivity(i);
                }

            }
        });


    }
}
