package com.apk14.cpot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    int jumlah = 0;
    String keterangan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        CheckBox cbEkspresiWajah0 = findViewById(R.id.cb_ekspresi_wajah0);
        CheckBox cbEkspresiWajah1 = findViewById(R.id.cb_ekspresi_wajah1);
        CheckBox cbEkspresiWajah2 = findViewById(R.id.cb_ekspresi_wajah2);
        CheckBox cbGerakanTubuh0 = findViewById(R.id.cb_gerakan_tubuh0);
        CheckBox cbGerakanTubuh1 = findViewById(R.id.cb_gerakan_tubuh1);
        CheckBox cbGerakanTubuh2 = findViewById(R.id.cb_gerakan_tubuh2);
        CheckBox cbVentilator0 = findViewById(R.id.cb_ventilator0);
        CheckBox cbVentilator1 = findViewById(R.id.cb_ventilator1);
        CheckBox cbVentilator2 = findViewById(R.id.cb_ventilator2);
        CheckBox cbOtot0 = findViewById(R.id.cb_ketegangan_otot0);
        CheckBox cbOtot1 = findViewById(R.id.cb_ketegangan_otot1);
        CheckBox cbOtot2 = findViewById(R.id.cb_ketegangan_otot2);


        btnSubmit.setOnClickListener(v -> {
            if (cbEkspresiWajah1.isChecked()){
                jumlah +=1;
            }
            if (cbEkspresiWajah2.isChecked()){
                jumlah +=2;
            }
            if (cbGerakanTubuh1.isChecked()){
                jumlah +=1;
            }
            if (cbGerakanTubuh2.isChecked()){
                jumlah +=2;
            }
            if (cbVentilator1.isChecked()){
                jumlah +=1;
            }
            if (cbVentilator2.isChecked()){
                jumlah +=2;
            }
            if (cbOtot1.isChecked()){
                jumlah +=1;
            }
            if (cbOtot2.isChecked()){
                jumlah +=2;
            }
            if (jumlah==0){
                keterangan="Tidak Nyeri";
            }else
            if (jumlah<=2){
                keterangan="NYERI RINGAN\n" +
                        "Penatalaksanaan:\n\n" +
                        "Non Farmakologi\n" +
                        "- Teknik Relaksasi Napas dalam\n" +
                        "- Beristirahat\n" +
                        "- Terapi Fisik\n" +
                        "- Meditasi\n\n" +
                        "Farmakologi\n" +
                        "- Nonnarkotik dan anti inflamasi nonsteroid (NSAID): Aspirin\n" +
                        "- Paracetamol";
            }else
            if (jumlah<=4){
                keterangan="NYERI SEDANG\n" +
                        "Penatalaksanaan:\n\n" +
                        "Non Farmakologi\n" +
                        "- Stimulasi dan massage punggung\n" +
                        "- Kompres dingin dan kompres hangat\n" +
                        "- Terapi Musik\n" +
                        "- Distraksi\n\n" +
                        "Farmakologi\n" +
                        "- Nonnarkotik dan anti inflamasi nonsteroid (NSAID)\n" +
                        "- Analgesik narkotik atau opioid: Kodein, Tramadol\n" +
                        "- Paracetamol\n" +
                        "- Koanalgesik\n" +
                        "- Morfin";
            }else
            if (jumlah<=6){
                keterangan="NYERI BERAT\n" +
                        "Penatalaksanaan:\n\n" +
                        "Non Farmakologi\n" +
                        "- Transcutaneous Elektrik Nerve Stimulation (TENS)\n\n" +
                        "Farmakologi\n" +
                        "- Analgesik narkotik atau opioid\n" +
                        "- Paracetamol\n" +
                        "- Katerolac";
            }else
            if (jumlah<=8){
                keterangan="NYERI SANGAT BERAT\n" +
                        "Penatalaksanaan:\n\n" +
                        "Non Farmakologi\n" +
                        "- Akupuntur\n\n" +
                        "Farmakologi\n" +
                        "- Analgesik narkotik atau opioid\n" +
                        "- Anti Depresan\n" +
                        "- Anti Inflamasi\n" +
                        "- Paracetamol";
            }
            Intent intent = new Intent(getApplicationContext(),HasilActivity.class);
            intent.putExtra("HASIL",jumlah);
            intent.putExtra("KETERANGAN",keterangan);


        });

    }
}