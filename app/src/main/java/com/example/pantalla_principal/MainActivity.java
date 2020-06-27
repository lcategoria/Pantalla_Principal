package com.example.pantalla_principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InicializarControles();
    }
    private void InicializarControles(){
        selec = (RadioButton)findViewById(R.id.estu);
        rol = (RadioGroup) findViewById(R.id.grupo);
    }

    public void RecetasDisponibles(View view){

        if(rol.getCheckedRadioButtonId()==R.id.estu){
            Intent i = new  Intent(MainActivity.this, RecetasDisponibles.class);
            startActivity(i);
        }

    }

    public void AgregarReceta(View view){

        if(rol.getCheckedRadioButtonId()==R.id.estu){
            Intent i = new  Intent(MainActivity.this, AgregarReceta.class);
            startActivity(i);
        }

    }

    public void RecetasGuardadas(View view){

        if(rol.getCheckedRadioButtonId()==R.id.estu){
            Intent i = new  Intent(MainActivity.this, RecetasGuardadas.class);
            startActivity(i);
        }

    }


}
