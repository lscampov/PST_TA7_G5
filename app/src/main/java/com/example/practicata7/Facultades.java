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
    public void fimcp(View v) {
        Intent i = new Intent(this, Fimcp.class );
        startActivity(i);
    }
    public void fimcm(View v) {
        Intent i = new Intent(this, Fimcm.class );
        startActivity(i);
    }public void fict(View v) {
        Intent i = new Intent(this, Fict.class );
        startActivity(i);
    }public void fcv(View v) {
        Intent i = new Intent(this, Fcv.class );
        startActivity(i);
    }public void fcsh(View v) {
        Intent i = new Intent(this, Fcsh.class );
        startActivity(i);
    }
    public void fcnm(View v) {
        Intent i = new Intent(this, Fcnm.class );
        startActivity(i);
    }
    public void fadcom(View v) {
        Intent i = new Intent(this, Fadcom.class );
        startActivity(i);
    }
}
