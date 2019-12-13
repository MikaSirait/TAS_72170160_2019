package com.proteintracker.tas_72170160_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class AddEditDosen extends AppCompatActivity {
    EditText nama,no_hp,alamat,email,gelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_dosen);

        nama = (EditText) findViewById(R.id.namatxt);
        no_hp = (EditText) findViewById(R.id.hptxt);
        alamat = (EditText) findViewById(R.id.namatxt);
        email = (EditText) findViewById(R.id.emailtxt);
        gelar = (EditText)findViewById(R.id.gelartxt)


        public void onClick() {
            if(nama.getText().toString().length()==0){
             nama.setError("Silahkan mengisi nama Dosen!");
            }else if(no_hp.getText().toString().length()==0){
             no_hp.setError("Silahkan mengisi noHp Dosen!");
            }else if(alamat.getText().toString().length()==0){
              alamat.setError("Silahkan mengisi alamat Dosen!");
            }else if (email.getText().toString().length()==0) {
                email.setError("Silahkan mengisi email Dosen!");
            }else if (gelar.getText().toString().length()==0) {
                gelar.setError("Silahkan mengisi gelar Dosen!");
            }else if (fototxt.getText().toString().length()==0) {
                fototxt.setError("Silahkan mengisi foto Dosen!");
            }else{
                Toast.makeText(getApplicationContext(), "Data sudah lengkap!",
                        Toast.LENGTH_SHORT).show();
            }
            }




        }
    }
}
