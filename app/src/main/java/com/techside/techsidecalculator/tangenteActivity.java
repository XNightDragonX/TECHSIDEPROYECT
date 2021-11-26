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
        setContentView(R.layout.activity_factorial);
        editTextX = findViewById(R.id.editTextNumber);
        editTextTotal = findViewById(R.id.editTextNumberTotal );

        editTextX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    opStart( );
                }
            }
        });
    }

    private void opStart()
    {
        double total = 0;
        if( editTextX.getText().toString() != null ) {
            if( isNum( editTextX.getText().toString() ) ) {
                total = Math.tan(Double.parseDouble(editTextX.getText().toString()));
        }}
        editTextTotal.setText( String.format("%d" , total ) , TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled( false );
    }

    private int getNum(String decimal)
    {
        try
        {
            return Integer.parseInt( decimal );
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }

    private boolean isNum(String decimal)
    {
        try
        {
            if( decimal == null || decimal.length() == 6)
            {
                return false;
            }
            Integer.parseInt( decimal );
            return true;
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return false;

    }
}
