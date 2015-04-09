package com.example.usuario.parametro1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText eNombre, eApellido;
    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eNombre = (EditText) findViewById(R.id.eNombre);
        eApellido = (EditText) findViewById(R.id.eApellido);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);
    }

    public void onClickAceptar(View view){


        String aux_nom = eNombre.getText().toString();
        String aux_ape = eApellido.getText().toString();

        if (!aux_nom.matches("") && !aux_ape.matches("")) {

            Intent i = new Intent(this, Gracias.class);
            i.putExtra("nombre", aux_nom);
            i.putExtra("apellido", aux_ape);
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(), "Ingrese un Valor", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
