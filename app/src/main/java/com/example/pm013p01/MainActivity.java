package com.example.pm013p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtpais, txtnombre ;
    Button btnagregar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtpais = (EditText) findViewById(R.id.txtpais);
        txtnombre= (EditText) findViewById(R.id.txtnombre);
        btnagregar= (Button) findViewById(R.id.Agregar);

        btnagregar.setOnClickListener(view -> {
            Toast.makeText( MainActivity.this, "HOLA", Toast.LENGTH_SHORT).show();//totas para mensaje mensaje
            Intent intent= new Intent(getApplicationContext(),MainActivity2.class);

            intent.putExtra( "nombre" , txtnombre.getText().toString());//putextra para mandar parametro
            intent.putExtra("pais", txtpais.getText().toString());

            startActivity(intent);

        });
    }
}