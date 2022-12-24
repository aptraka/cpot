package com.apk14.cpot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        TextView tvJumlah = findViewById(R.id.tv_jumlah);
        TextView tvKeterangan=findViewById(R.id.tv_keterangan);
        Intent intent = getIntent();
        tvJumlah.setText(intent.getStringExtra("HASIL"));
        tvKeterangan.setText(intent.getStringExtra("KETERANGAN"));
    }
}