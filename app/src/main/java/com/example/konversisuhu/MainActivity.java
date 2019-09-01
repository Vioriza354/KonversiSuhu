package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText celcius;
    TextView reamur,fahrenheit,kelvin;
    Button konversi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celcius = (EditText) findViewById(R.id.txtCelcius);
        reamur = (TextView) findViewById(R.id.txtReamur);
        fahrenheit = (TextView) findViewById(R.id.txtfarenheit);
        kelvin = (TextView) findViewById(R.id.txtKelvin);
        konversi = (Button) findViewById(R.id.btnKonversi);
        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vcelcius = celcius.getText().toString();
                double c = Double.parseDouble(vcelcius);
                double hreamur = c * 4/5;
                double hfahrenheit = c * 9/5 + 32;
                double hkelvin = c * 273;

                reamur.setText(Double.toString(hreamur));
                fahrenheit.setText(Double.toString(hfahrenheit));
                kelvin.setText(Double.toString(hkelvin));

            }
        });
    }




}
