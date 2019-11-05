package com.example.eva2_4_activitystack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Segunda extends AppCompatActivity {

    Intent inBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //inBack = new Intent(this, MainActivity.class);
    }

    public void miClick(View v){
        //startActivity(inBack);
        finish();
    }
}
