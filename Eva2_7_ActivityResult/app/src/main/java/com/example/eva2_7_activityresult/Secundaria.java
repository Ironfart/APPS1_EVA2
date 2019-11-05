package com.example.eva2_7_activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Secundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
    }

    public void clickEnviar(View v){
        if (v.getId() == R.id.btnCancel){
            setResult(Activity.RESULT_CANCELED);
            finish();
        } else {
            Intent inDatos = new Intent();
            inDatos.putExtra("mensaje", "No cayó el meteorito");
            setResult(Activity.RESULT_OK, inDatos);

            finish();
        }


    }
}
