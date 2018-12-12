package com.example.toshiba.supershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    //metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_login , menu);
        return true;
    }

    //metodo para signar las funciones a las opciones
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id==R.id.sesion_item1){

        } else if(id==R.id.sesion_item2){
            Intent contacto =new Intent(this , Contacto.class);
            startActivity(contacto);
        } else if(id==R.id.sesion_item3){
            Intent acercaDe =new Intent(this , AcercaDe.class);
            startActivity(acercaDe);
        } else if(id==R.id.sesion_item4){
            Intent agregar =new Intent(this , AgregarProducto.class);
            startActivity(agregar);
        } else if(id==R.id.sesion_item5){
            Intent cerrar =new Intent(this , MainActivity.class);
            startActivity(cerrar);
        }

        return super.onOptionsItemSelected(item);
    }
}
