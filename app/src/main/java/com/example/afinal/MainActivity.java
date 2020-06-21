package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton nextbtn;
    TextView regisbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        regisbtn = (TextView) findViewById(R.id.register_text);
        regisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenregisbtn = new Intent(MainActivity.this, registrasi.class);
                startActivity(intenregisbtn);
            }
        });
        nextbtn = (ImageButton) findViewById(R.id.btn1);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenmenubtn = new Intent(MainActivity.this, menu.class);
                startActivity(intenmenubtn);
            }
        });


    }}