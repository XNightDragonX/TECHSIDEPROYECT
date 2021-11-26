package com.techside.techsidecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tangenteActivity extends AppCompatActivity {

    private EditText editTextX;
    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangente);
        editTextX = findViewById(R.id.editTextNumber);
        editTextTotal = findViewById(R.id.editTextNumberTotal);
        editTextTotal.setEnabled(false);
        editTextX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    realizaOperacion();
                }
            }
        });
    }

    public void realizaOperacion() {
        int aux = editTextX.length();
        double dNum1 = 0.0;
        double resultado = 0.0;
        String arg = editTextX.toString(), sResultado;
        for (int i = 0; i < aux; i++)
            dNum1 = dNum1 + arg.charAt(i);
        double rad = Math.toRadians(dNum1);
        System.out.println(rad);
        resultado = Math.tan(rad);
        System.out.println(resultado);
        sResultado = Double.toString(resultado);
        if (dNum1 == 90.0) {
            editTextTotal.setText("∞");
        } else {
            editTextTotal.setText(sResultado);
        }
    }
}