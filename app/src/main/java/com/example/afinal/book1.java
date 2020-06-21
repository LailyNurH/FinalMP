package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class book1 extends AppCompatActivity {
    ImageButton btnpinjam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        btnpinjam=(ImageButton) findViewById(R.id.btn_pinjam);
        btnpinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenpinjam= new Intent(book1.this,pinjambukuu.class);
                startActivity(intenpinjam);
            }
        });
    }
}
