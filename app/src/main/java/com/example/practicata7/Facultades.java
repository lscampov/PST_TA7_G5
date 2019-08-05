package com.example.practicata7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Facultades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facultades);
    }

    public void fiec(View v) {
        Intent i = new Intent(this, Fiec.class );
        startActivity(i);
    }
}
