package com.techside.techsidecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void suma(View miView)
    { }
    public void resta(View miView)
    { }
    public void multiplicacion(View miView)
    { }
    public void division(View miView)
    { }
    public void factorial(View miView)
    { }
    public void kelvin(View miView)
    { }
    public void tangente(View miView)
    { }

    private Button Button_suma;
    private Button Button_resta;
    private Button Button_division;
    private Button Button_multiplicacion;
    private Button Button_Factorial;
    private Button Button_kelvin;
    private Button Button_tangente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_suma = findViewById(R.id.Button_suma);
        Button_resta = findViewById(R.id.Button_resta);
        Button_multiplicacion = findViewById(R.id.Button_multiplicacion);
        Button_division = findViewById(R.id.Button_division);
        Button_Factorial = findViewById(R.id.Button_Factorial);
        Button_kelvin = findViewById(R.id.Button_kelvin);

        Button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSuma();
            }
        });

        Button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirResta();
            }
        });

        Button_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMultiplicacion();
            }
        });

        Button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirDivision();
            }
        });

        Button_Factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirFactorial();
            }
        });

        Button_kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirKelvin();
            }
        });

        Button_tangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirTan();
            }
        });

    }

    private void abrirSuma() {
        Intent intent = new Intent(this , SumaActivity.class);
        startActivity(intent);
    }

    private void abrirResta() {
        Intent intent = new Intent(this , RestaActivity.class);
        startActivity(intent);
    }

    private void abrirMultiplicacion() {
        Intent intent = new Intent(this , MultiplicationActivity.class);
        startActivity(intent);
    }

    private void abrirDivision() {
        Intent intent = new Intent(this , DivisionActivity.class);
        startActivity(intent);
    }

    private void abrirFactorial() {
        Intent intent = new Intent(this , FactorialActivity.class);
        startActivity(intent);
    }

    private void abrirKelvin() {
        Intent intent = new Intent(this , KelvinActivity.class);
        startActivity(intent);
    }
    private void abrirTan() {
        Intent intent = new Intent(this , Tangente.class);
        startActivity(intent);
    }
}