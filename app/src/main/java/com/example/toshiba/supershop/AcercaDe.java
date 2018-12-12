package com.example.toshiba.supershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }
    //metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu , menu);
        return true;
    }

    //metodo para signar las funciones a las opciones
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id==R.id.item1){
            Intent inicio =new Intent(this , MainActivity.class);
            startActivity(inicio);
        } else if(id==R.id.item3){
            Intent contacto =new Intent(this , Contacto.class);
            startActivity(contacto);
        } else if(id==R.id.item4){
            Intent acercaDe =new Intent(this , AcercaDe.class);
            startActivity(acercaDe);
        } else if(id==R.id.item5){
            Intent inicioSesion =new Intent(this , IniciarSesion.class);
            startActivity(inicioSesion);
        }


        return super.onOptionsItemSelected(item);
    }

}
