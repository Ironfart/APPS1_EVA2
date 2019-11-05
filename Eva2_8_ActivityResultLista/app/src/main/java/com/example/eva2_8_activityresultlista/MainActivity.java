package com.example.eva2_8_activityresultlista;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        ComponentName cn = new ComponentName("com.example.eva1_10_listaclima", "com.example.eva1_10_listaclima.MainActivity");

        Intent in = new Intent(Intent.ACTION_MAIN);
        in.setComponent(cn);

        startActivityForResult(in, 1000);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1000) {
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, data.getStringExtra("ciudades"), Toast.LENGTH_SHORT).show();
            }
        } else if (requestCode == 2000) {
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, data.getDataString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onClickCont(View v) {
        Intent in = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);

        startActivityForResult(in,2000);
    }
}
