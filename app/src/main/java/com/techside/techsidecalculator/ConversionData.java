package com.techside.techsidecalculator;

import static com.techside.techsidecalculator.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.internal.ForegroundLinearLayout;

public class ConversionData extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_data);
    }
    public EditText editTextX;
    public EditText editTextTotal;
    String Result;
    float Convert;
    public void onClickMBKb(View miView){
        editTextX = findViewById(R.id.editTextNumberX);
        editTextTotal = findViewById(R.id.editTextNumberTotal);
        editTextTotal.setEnabled(false);
        Convert = Float.parseFloat(editTextX.getText().toString());
        Result = Float.toString(Convert * 8000);
        editTextTotal.setText(Result.toString());
    }
    public void onClickKbMB(View miView){
        editTextX = findViewById(R.id.editTextNumberX);
        editTextTotal = findViewById(R.id.editTextNumberTotal);
        editTextTotal.setEnabled(false);
        Convert = Float.parseFloat(editTextX.getText().toString());
        Result = Float.toString(Convert / 8000);
        editTextTotal.setText(Result.toString());
    }
}