package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView balll;
    private TextView respuesta;

    private String[] respuestaArray = {"Nunca te permitas terminar un día en el que puedas decir “Lo haré mejor mañana“","«Recuerda, hoy es el mañana acerca del cual te preocupabas ayer»","«Lo mejor acerca del futuro es que nos llega solo un día a la vez»", "Vive el hoy sin pensar en el mañana"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        balll = findViewById(R.id.boton);

        respuesta = findViewById(R.id.respuesta);

        balll.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Buscando tu destino", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.boton:
                int random = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[random]);

                break;
        }
    }
}
