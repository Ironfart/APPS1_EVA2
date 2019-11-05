package com.example.eva2_9_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickStd(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo estándar")
                .setMessage("Hola baby \uD83D\uDE18")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Action
                        Toast.makeText(getApplicationContext(), "Boton OK", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Action
                        Toast.makeText(getApplicationContext(), "Boton NO", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Action
                        Toast.makeText(getApplicationContext(), "Boton Cancelar", Toast.LENGTH_SHORT).show();
                    }
                })
                .create().show();
    }

    public void clickPers(View v){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);

        //Vincular widgets del cuadro de dialogo
        final EditText edTxtName;
        Button btnOK;

        edTxtName = dialog.findViewById(R.id.edTxtName);
        btnOK = dialog.findViewById(R.id.btnOk);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena = edTxtName.getText().toString();
                Toast.makeText(getApplicationContext(), cadena, Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
