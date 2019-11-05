package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtRecibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        txtRecibe = findViewById(R.id.txtRecieve);

        Intent in = getIntent();
        //in.getStringExtra("datos"); obtener datos

        txtRecibe.setText(in.getStringExtra("datos"));
    }

    public void cerrar(View v){
        finish();
    }
}
