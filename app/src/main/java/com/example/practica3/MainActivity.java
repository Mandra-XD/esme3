package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cNum1;
    EditText cNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //metodo1();//Mando a llamar el método

        cNum1 = findViewById(R.id.gNum1);
        cNum2 = findViewById(R.id.gNum2);
    }

    public void bAceptar(View vista){
        Toast.makeText(this, "Num1 + Num2 " + operacion(), Toast.LENGTH_SHORT).show();
        //metodo2();
    }

    private  float operacion(){
        //Toast.makeText(this, "Es el segundo mensaje", Toast.LENGTH_SHORT).show();
        //Crear variables
        int numero1, numero2;
        float result;

        //Conversión de tipos
        numero1 = Integer.parseInt(cNum1.getText().toString());
        numero2 = Integer.parseInt(cNum2.getText().toString());

        result = numero1 + numero2;

        return result;
    }

}