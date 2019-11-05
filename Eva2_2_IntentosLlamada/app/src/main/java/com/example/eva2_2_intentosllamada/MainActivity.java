package com.example.eva2_2_intentosllamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inMarcar;
    EditText txtTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTel = findViewById(R.id.txtTel);
    }

    public void click(View v){
        View btn = findViewById(R.id.button);
        String tel = "tel:"+txtTel.getText().toString();

        if (v == btn){
            inMarcar = new Intent(Intent.ACTION_CALL, Uri.parse(tel));
        } else {
            inMarcar = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
        }


        startActivity(inMarcar);
    }
}
