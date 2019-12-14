package com.proteintracker.tas_72170160_2019;

import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class CRUD_mhs extends AppCompatActivity {

    Button bsimpan;
    EditText enim, enama, etempatlahir, etanggallahir;
    TextView thasil;
    RadioGroup rgjk;
    Spinner skelas, sagama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_mhs);

        bsimpan = (Button) findViewById(R.id.simpan);
        enim = (EditText) findViewById(R.id.isinim);
        enama = (EditText) findViewById(R.id.isinama);
        thasil = (TextView) findViewById(R.id.hasil);
        rgjk = (RadioGroup) findViewById(R.id.jk);
        skelas = (Spinner) findViewById(R.id.kelas);
        sagama = (Spinner) findViewById(R.id.agama);
        etempatlahir = (EditText) findViewById(R.id.tempatlahir);
        etanggallahir = (EditText) findViewById(R.id.tanggallahir);

        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputnim = String.valueOf(enim.getText().toString());
                String inputnama = String.valueOf(enama.getText().toString());
                String inputtempatlahir = String.valueOf(etempatlahir.getText().toString());
                String inputtanggallahir = String.valueOf(etanggallahir.getText().toString());

                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputjk = String.valueOf(jk.getText().toString());

                thasil.setText("\n" + "NIM\t\t\t\t\t\t\t\t\t\t\t: " + inputnim + "\n" +
                        "Nama\t\t\t\t\t\t\t\t\t\t: " + inputnama + "\n" +
                        "Jenis Kelamin\t\t: " + inputjk + "\n" +
                        "Kelas\t\t\t\t\t\t\t\t\t\t: " + skelas.getSelectedItem().toString() + "\n" +
                        "Agama\t\t\t\t\t\t\t\t\t: " + sagama.getSelectedItem().toString() + "\n" +
                        "Jenis Kelamin\t\t: " + inputtempatlahir + "\n" +
                        "Tanggal Lahir\t\t\t: " + inputtanggallahir + "\n");
            }
        });
        public void onClick ()
        if (enim.getText().toString().length() == 0) {
            enim.setError("Silahkan mengisi NIM ");
        }
        if (enama.getText().toString().length() == 0) {
            enama.setError("Silahkan mengisi nama");

        }
        if (etempatlahir.getText().toString().length() == 0) {
            etempatlahir.setError("Silahkan mengisi tempat lahir");
        }
        if (etanggallahir.getText().toString().length() == 0) {
            etanggallahir.setError("Silahkan mengisi tanggal lahir");

        }

    }

        else

    {
        Toast.makeText(CRUD_mhs.this, "Data berhasil diinput", Toast.LENGTH_SHORT).show();

    }
}




