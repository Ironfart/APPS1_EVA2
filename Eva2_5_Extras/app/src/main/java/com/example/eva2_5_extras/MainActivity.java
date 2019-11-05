package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inLanzar;
    EditText txtMandar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inLanzar = new Intent(this, Secundaria.class);
        txtMandar = findViewById(R.id.txtSend);
    }

    public void enviarInfo(View v){
        String msg = txtMandar.getText().toString();
        inLanzar.putExtra("datos",msg);
        inLanzar.putExtra("num",100);

        startActivity(inLanzar);
    }
}
