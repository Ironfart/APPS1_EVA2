package com.example.eva2_6_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtVwDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        txtVwDatos = findViewById(R.id.txtVwDatos);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        txtVwDatos.append(b.getString("nombre") + " \n");
        txtVwDatos.append(b.getString("apellido") + " \n");
        txtVwDatos.append(b.getInt("edad") + " \n");
        switch (b.getInt("sexo")){
            case 0:
                txtVwDatos.append("Mucho\n");
            case 1:
                txtVwDatos.append("Maso\n");
            case 2:
                txtVwDatos.append("Poco\n");
            case 3:
                txtVwDatos.append("ISC\n");
        }
    }
}
