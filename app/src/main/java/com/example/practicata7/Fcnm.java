package com.example.practicata7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Fcnm extends AppCompatActivity {
    private Spinner spinner1;
    private TextView tx1;
    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcnm);

        spinner1= (Spinner)findViewById(R.id.spinner);
        tx1= (TextView)findViewById(R.id.prom);
        img1= (ImageView)findViewById(R.id.imageView);

        String [] opciones= {"Ingeniería Química","Matematica","Logistica y Transporte"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

    }
    public void Seleccionar(View v){
        String seleccion= spinner1.getSelectedItem().toString();
        if (seleccion.equals("Ingeniería Química")){
            img1.setImageResource(R.drawable.quimica);
            tx1.setText("8,47");
            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        } else if (seleccion.equals("Matematica")){
            tx1.setText("8,08");
            img1.setImageResource(R.drawable.matematica);
            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Logistica y Transporte")){
            tx1.setText("7,89");
            img1.setImageResource(R.drawable.logistica);
            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }

    }
}
