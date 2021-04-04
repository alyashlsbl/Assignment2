package com.example.assignment2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReadActivity extends AppCompatActivity {

    private TextView tvName, tvNIM, tvIPK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        tvName = findViewById(R.id.tv_name2);
        tvNIM = findViewById(R.id.tv_nim2);
        tvIPK = findViewById(R.id.tv_ipk2);

        Bundle extras = getIntent().getExtras();
        String sName = extras.getString("Name");
        String sNIM = extras.getString("NIM");
        String sIPK = extras.getString("IPK");

        tvName.setText(sName);
        tvNIM.setText(sNIM);
        tvIPK.setText(sIPK);

//        String sName = getIntent().getExtras().getString("name");
//        String sNim = getIntent().getExtras().getString("nim");
//        String sIpk = getIntent().getExtras().getString("ipk");

//        String sValue;
//
//        double ipk = Double.parseDouble(sIpk);
//        if(ipk > 3.66 && ipk <= 4.00){
//            sValue = "A";
//        }else if(ipk > 3.33 && ipk <= 3.66){
//            sValue = "A-";
//        }else if(ipk > 3.00 && ipk <= 3.33){
//            sValue = "B+";
//        }else if(ipk > 2.66 && ipk <= 3.00){
//            sValue = "B";
//        }else if(ipk > 2.33 && ipk <= 2.66){
//            sValue = "B-";
//        }else if(ipk > 2.00 && ipk <= 2.33){
//            sValue = "C+";
//        }else if(ipk > 1.66 && ipk <= 2.00){
//            sValue = "C";
//        }else if(ipk > 1.33 && ipk <= 1.66){
//            sValue = "C-";
//        }else if(ipk > 1.00 && ipk <= 1.33){
//            sValue = "D+";
//        }else{
//            sValue = "D";
//        }

//        tvName.setText(sName);
//        tvNIM.setText(sNim);
//        tvIPK.setText(sValue);

    }

}
