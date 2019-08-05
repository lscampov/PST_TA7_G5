package com.example.practicata7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Descripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcion);
    }

    public void cuestionario(View view) {
        Intent i = new Intent(this, CorreoInfo.class );
        startActivity(i);
    }
}
