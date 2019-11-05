package com.example.eva2_3_mensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTel, txtMsg;

    Intent inSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTel = findViewById(R.id.txtTel);
        txtMsg = findViewById(R.id.txtMsg);
    }

    public void onClick(View v){
        String sTel = "smsto:"+txtTel.getText().toString();

        inSms = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));

        inSms.putExtra("sms_body", txtMsg.getText().toString());

        startActivity(inSms);
    }
}
