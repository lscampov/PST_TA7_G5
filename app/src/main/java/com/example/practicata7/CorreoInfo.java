package com.example.practicata7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CorreoInfo extends AppCompatActivity {

    EditText etnombres, etapellidos, etphone, etmail;
    Button btnInfo;
    Intent emailIntent = new Intent(Intent.ACTION_SEND);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correo);
        etnombres = (EditText) findViewById(R.id.editText);
        etapellidos = (EditText) findViewById(R.id.editText2);
        etphone = (EditText) findViewById(R.id.editText3);
        etmail = (EditText) findViewById(R.id.editText4);
        btnInfo = (Button) findViewById(R.id.button5);

        btnInfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(CorreoInfo.this);
                alerta.setMessage("¿Está seguro que desea enviar su información?")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                String[] to = {"lscampov@espol.edu.ec"};
                                String[] cc = {"lscampov@espol.edu.ec"};
                                emailIntent.setData(Uri.parse("mailto:"));
                                emailIntent.setType("text/plain");
                                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                                emailIntent.putExtra(Intent.EXTRA_CC, cc);
                                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Formulario de mayor información");


                                emailIntent.putExtra(Intent.EXTRA_TEXT, "Datos de Contacto\n" +
                                        "Nombres:" + etnombres.getText().toString() + "\n" +
                                        "Apellidos:" + etapellidos.getText().toString() + "\n" +
                                        "Teléfono:" + etphone.getText().toString() + "\n" +
                                        "Correo Electrónico:" + etmail.getText().toString() + "\n");

                                try {
                                    startActivity(Intent.createChooser(emailIntent, "Enviando Email"));
                                    Log.i("termina envio de email", "");
                                } catch (android.content.ActivityNotFoundException ex) {
                                    Toast.makeText(CorreoInfo.this, "No existe cliente Email instalado.", Toast.LENGTH_SHORT).show();


                                }
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Mayor Información");
                titulo.show();

            }


        });

    }

    }