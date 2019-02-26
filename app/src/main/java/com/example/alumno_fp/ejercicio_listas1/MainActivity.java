package com.example.alumno_fp.ejercicio_listas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

      EditText nombre_lugar;
      EditText nombre_ciudad;
      EditText nombre_pais;

    Button boton_guardar;

    ListView listaLugar;
    ArrayAdapter<String> lAdapter;

    List<String> lugares = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLugar = findViewById(R.id.list);
        nombre_lugar = findViewById(R.id.nombre_lugar);
        nombre_ciudad = findViewById(R.id.nombre_ciudad);
        nombre_pais = findViewById(R.id.nombre_pais);
        boton_guardar = findViewById(R.id.boton_guardar);

        lAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                lugares);
        listaLugar.setAdapter(lAdapter);

        boton_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String placeName = nombre_lugar.getText().toString();
                lugares.add(placeName);
                lAdapter.notifyDataSetChanged();

                String cityName = nombre_ciudad.getText().toString();
                lugares.add(cityName);
                lAdapter.notifyDataSetChanged();

                String countryName = nombre_pais.getText().toString();
                lugares.add(countryName);
                lAdapter.notifyDataSetChanged();
            }
        });







    }
}

