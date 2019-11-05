package com.example.eva2_4_activitystack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent inLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inLanzar = new Intent(this, Segunda.class);
    }

    public void onClick(View v){
        startActivity(inLanzar);
    }
}
