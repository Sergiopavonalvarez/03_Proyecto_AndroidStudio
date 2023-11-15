package com.example.a03_proyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botonIzqui (View vista){
        TextView botonizquierda =  findViewById(R.id.textView);
        RadioButton izq = findViewById(R.id.rdtizq);
        if(izq.isChecked()){
            botonizquierda.setText("el boton izquierdo esta pulsado, mientras que el derecho no esta pulsado");
        }else{
            botonizquierda.setText("el boton derecho esta pulsado, mientras que el izquierdo no esta pulsado");
        }
    }
    public void botonDer (View vista){
        TextView botonizquierda1 =  findViewById(R.id.textView);
        RadioButton izq = findViewById(R.id.rdtder);
        if(izq.isChecked()){
            botonizquierda1.setText("el boton derecho esta pulsado, mientras que el izquierdo no esta pulsado");
        }else{
            botonizquierda1.setText("el boton izquierdo esta pulsado, mientras que el derecho no esta pulsado");
        }
    }
}