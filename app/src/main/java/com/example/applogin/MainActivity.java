package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ir;
    EditText usu, contra;
    String U = "admin";
    String C = "admin";
    TextView Noti;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ir = (Button) findViewById(R.id.btnInicio);
        usu = (EditText) findViewById(R.id.editUsua);
        contra = (EditText) findViewById(R.id.editContra);
        Noti = (TextView) findViewById(R.id.txtMostrar);

        //Para poder cambiar de ventana


        ir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(usu.getText().toString().isEmpty() && contra.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Campos vacios", Toast.LENGTH_SHORT).show();

                }else if (usu.getText().toString().equals("Admin") && contra.getText().toString().equals("Admin")) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Datos Invalidos", Toast.LENGTH_SHORT).show();
                }
            }

        } );

        }
    }

