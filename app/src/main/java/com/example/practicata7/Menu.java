package com.example.practicata7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;


public class Menu extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    imageView= (ImageView) findViewById(R.id.imageView3);
    }

    public void facultades(View view) {
        Intent i = new Intent(this, Facultades.class );
        startActivity(i);
    }

    public void mapa(View view) {
        Intent i = new Intent(this, Mapa.class );
        startActivity(i);
    }

    public void descripcion(View view) {
        Intent i = new Intent(this, Descripcion.class );
        startActivity(i);
    }
}
