package com.desma.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNpm;
    TextView txtNama;
    TextView txtAlamat;
    TextView txtProdi;
    EditText editNpm;
    EditText editNama;
    EditText editAlamat;
    EditText editProdi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNpm  = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);
        txtAlamat = (TextView) findViewById(R.id.txtAlamat);
        txtProdi = (TextView) findViewById(R.id.txtProdi);
        editNpm  = (EditText) findViewById(R.id.editNpm);
        editNama = (EditText) findViewById(R.id.editNama);
        editAlamat  = (EditText) findViewById(R.id.editAlamat);
        editProdi  = (EditText) findViewById(R.id.editProdi);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = editNpm.getText().toString();
                String strNama = editNama.getText().toString();
                String strAlamat = editAlamat.getText().toString();
                String strProdi = editProdi.getText().toString();

                txtNpm.setText(strNpm);
                txtNama.setText(strNama);
                txtAlamat.setText(strAlamat);
                txtProdi.setText(strProdi);

            }
        });


    }
}



