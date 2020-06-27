package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class cinema extends AppCompatActivity {
    ImageButton btn_pinjam;
    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tanggal;
    private TextView et_tgl;
    EditText et_nama,et_organisasi,et_peserta;
    String nama,organisasi,tgl, peserta,cinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cinema);

        btn_pinjam=(ImageButton) findViewById(R.id.btn_pinjam);
        et_nama=(EditText) findViewById(R.id.et_nama);
        et_organisasi=(EditText) findViewById(R.id.et_organisasi);
        et_tgl=(TextView) findViewById(R.id.et_tgl);
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
        dateFormatter=new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        et_tgl=(TextView)findViewById(R.id.et_tgl);
        tanggal=(TextView) findViewById(R.id.tgl);
        tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });


    }

    private void showDateDialog() {
        Calendar newCalendar= Calendar.getInstance();
        datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year,monthOfYear, dayOfMonth);

                et_tgl.setText("  " +dateFormatter.format(newDate.getTime()));
            }
        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
}
