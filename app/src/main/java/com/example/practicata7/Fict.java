package com.example.practicata7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Fict extends AppCompatActivity {

    private Spinner spinner1;
    private TextView tx1;
    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fict);

        spinner1= (Spinner)findViewById(R.id.spinner);
        tx1= (TextView)findViewById(R.id.prom);
        img1= (ImageView)findViewById(R.id.imageView);

        String [] opciones= {"Ingeneria en Minas","Ingeniería en Petroleos","Ingeniería civil"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);


    }
    public void Seleccionar(View v){
        String seleccion= spinner1.getSelectedItem().toString();
        if (seleccion.equals("Ingeneria en Minas")){
            img1.setImageResource(R.drawable.elect);
            tx1.setText("8,47");
            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        } else if (seleccion.equals("Ingeniería en Petroleos")){
            tx1.setText("8,08");
            img1.setImageResource(R.drawable.comp);
            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }else if (seleccion.equals("Ingeniería civil")){
            tx1.setText("7,89");
            img1.setImageResource(R.drawable.telematica);
            Toast.makeText(this, "Selección Exitosa", Toast.LENGTH_LONG).show();
        }

    }
}
