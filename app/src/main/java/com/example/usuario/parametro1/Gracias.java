package com.example.usuario.parametro1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by usuario on 09/04/2015.
 */
public class Gracias extends Activity{

    TextView tGracias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gracias);
        tGracias = (TextView) findViewById(R.id.tGracias);
        Bundle extras = getIntent().getExtras();
        String xnom = extras.getString("nombre");
        String xape = extras.getString("apellido");

        tGracias.setText("Gracias " + xnom + ", " + xape + " por ser tan PRO!");
    }
}
