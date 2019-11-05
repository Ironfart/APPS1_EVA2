package com.example.eva2_7_activityresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtDatos;
    Intent inLaunch;

    final int sec = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDatos = findViewById(R.id.txtDatos);
        inLaunch = new Intent(this,Secundaria.class);
    }

    public void clickLaunch(View v){
        startActivityForResult(inLaunch, sec);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case sec:
                //algo con los datos
                if (resultCode == Activity.RESULT_OK){
                    //aqui recibimos datos
                    txtDatos.setText(data.getStringExtra("mensaje"));
                } else
                    Toast.makeText(this, "Accion cancelada", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
    }
}
