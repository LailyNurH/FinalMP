package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pinjam_ruang extends AppCompatActivity {
    ImageButton cinema,abp,bsc,citra1,citra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam_ruang);

        cinema=(ImageButton)findViewById(R.id.act_cinema);
        cinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencinema=new Intent(pinjam_ruang.this,cinema.class);
                startActivity(intencinema);
            }
        });

        abp=(ImageButton) findViewById(R.id.act_abp);
        abp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenabp= new Intent(pinjam_ruang.this,abp.class);
                startActivity(intenabp);
            }
        });
        bsc=(ImageButton) findViewById(R.id.act_bsc);
        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenbsc= new Intent(pinjam_ruang.this,bsc.class);
                startActivity(intenbsc);
            }
        });
        citra1=(ImageButton) findViewById(R.id.act_c1);
        citra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenc1= new Intent(pinjam_ruang.this,citra1.class);
                startActivity(intenc1);
            }
        });
        citra2=(ImageButton) findViewById(R.id.act_c2);
        citra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenc2= new Intent(pinjam_ruang.this,citra2.class);
                startActivity(intenc2);
            }
        });
    }
}
