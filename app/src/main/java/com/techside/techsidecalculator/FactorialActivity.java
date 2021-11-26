package com.techside.techsidecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FactorialActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editTextTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        editText = findViewById(R.id.editTextNumber);
        editTextTotal = findViewById(R.id.editTextNumberTotal );
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus ){
                    realizaOperacion( );
                }
            }
        });
    }

    private void realizaOperacion()
    {
        int total = 0;
        if( editText.getText().toString() != null )
        {
            if( isEntero( editText.getText().toString() ) )
            {
                total += getEntero( editText.getText().toString() );
            }
        }
        int fx = total;
        int con = total;
        while ( con!=0) {
            total=total*con;
            con--;
        }
        total = total/fx;
        editTextTotal.setText( String.format("%d" , total ) , TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled( false );
    }

    private int getEntero(String entero)
    {
        try
        {
            return Integer.parseInt( entero );
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }

    private boolean isEntero(String entero)
    {
        try
        {
            if( entero == null || entero.length() == 0)
            {
                return false;
            }
            Integer.parseInt( entero );
            return true;
        }
        catch( NumberFormatException ex)
        {
            ex.printStackTrace();
        }
        return false;

    }
}