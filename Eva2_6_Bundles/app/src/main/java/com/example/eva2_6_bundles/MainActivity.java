package com.example.eva2_6_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText txtNom, txtAp, txtEdad;
    RadioGroup radGpSex;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNom = findViewById(R.id.txtNom);
        txtAp = findViewById(R.id.txtAp);
        txtEdad = findViewById(R.id.txtEdad);
        radGpSex = findViewById(R.id.radGpSex);
        inDatos = new Intent(this, Secundaria.class);
    }

    public void onClick(View v){
        //insertar datos al intent
        Bundle b = new Bundle();
        b.putString("nombre",txtNom.getText().toString());
        b.putString("apellido",txtAp.getText().toString());
        int edad = Integer.parseInt(txtEdad.getText().toString());
        b.putInt("edad",edad);

        int sex;
        if (radGpSex.getCheckedRadioButtonId() == R.id.radBtnMucho)
            sex = 0;
        else if (radGpSex.getCheckedRadioButtonId() == R.id.radBtnMaso)
            sex = 1;
        else if (radGpSex.getCheckedRadioButtonId() == R.id.radBtnPoco)
            sex = 2;
        else
            sex = 3;

        b.putInt("sexo",sex);
        inDatos.putExtras(b);
        startActivity(inDatos);
    }

}
