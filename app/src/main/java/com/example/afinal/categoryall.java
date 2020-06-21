package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class categoryall extends AppCompatActivity implements View.OnClickListener {
    ImageButton komunikasi,saintek;

    komunikasi fragmentkomunikasi;
    saintek     fragmentsaintek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryall);

        komunikasi= (ImageButton) findViewById(R.id.cat_1);
        saintek=(ImageButton) findViewById(R.id.cat_2);

        komunikasi.setOnClickListener(this);
        saintek.setOnClickListener(this);

    }
    void menukomunikasi(){
        fragmentkomunikasi= new komunikasi();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentkomunikasi);
        ft.commit();

    }
    void menusaintek(){
        fragmentsaintek= new saintek();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentsaintek);
        ft.commit();

    }
    @Override
    public  void onClick(View v){
        if (v == komunikasi) {
            menukomunikasi();
        }
        if (v == saintek) {
            menusaintek();
        }
    }
}
