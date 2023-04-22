package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button regreso,guardar;
    EditText dpi,nombre,direccion,telefono;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dpi = (EditText) findViewById(R.id.EditDpi);
        nombre = (EditText) findViewById(R.id.EditNombre);
        direccion = (EditText) findViewById(R.id.EditDireccion);
        telefono = (EditText) findViewById(R.id.EditTelefono);
        guardar = (Button) findViewById(R.id.btnGuardar);
        regreso = (Button) findViewById(R.id.btnRegreso);

        final BaseDb datos = new BaseDb(getApplicationContext());

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dpi.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity2.this, "Campo Vacio", Toast.LENGTH_SHORT).show();

                }
                else if(nombre.getText().toString().isEmpty()){

                    Toast.makeText(MainActivity2.this, "Campo Vacio", Toast.LENGTH_SHORT).show();
                }
                else if(direccion.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Campo Vacio", Toast.LENGTH_SHORT).show();
                }
                else if(telefono.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Campo Vacio", Toast.LENGTH_SHORT).show();
                }
                else{
                datos.agregarApp(dpi.getText().toString(),nombre.getText().toString(),direccion.getText().toString(),telefono.getText().toString());
                Toast.makeText(MainActivity2.this, "Se AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
                }
            }
        });

       regreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}