package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {
    ImageButton menubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menubtn = (ImageButton) findViewById(R.id.move_pjmbuku);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmenubtn = new Intent(menu.this, Pinjam_buku.class);
                startActivity(intenmenubtn);
            }
        });

        menubtn = (ImageButton) findViewById(R.id.move_pjmruang);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmenubtn = new Intent(menu.this, pinjam_ruang.class);
                startActivity(intenmenubtn);
            }
        });

        menubtn = (ImageButton) findViewById(R.id.move_about);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmenubtn = new Intent(menu.this, about.class);
                startActivity(intenmenubtn);
            }
        });
        menubtn = (ImageButton) findViewById(R.id.move_riwayat);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmenubtn = new Intent(menu.this, riwayat.class);
                startActivity(intenmenubtn);
            }
        });

        menubtn = (ImageButton) findViewById(R.id.out);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmenubtn = new Intent(menu.this, MainActivity.class);
            }

        });
    }
}
