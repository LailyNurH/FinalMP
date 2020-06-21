package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pinjam_buku extends AppCompatActivity {
    TextView viewall_cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam_buku);

        viewall_cat=(TextView) findViewById(R.id.cat_view);
        viewall_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencategory = new Intent(Pinjam_buku.this,categoryall.class);
                startActivity(intencategory);
            }
        });
    }
}
