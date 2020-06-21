package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class frgmntdata extends AppCompatActivity {
    ImageButton saintek_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frgmntdata);
        saintek_1= (ImageButton) findViewById(R.id.frg_saintek1);

    }
}
