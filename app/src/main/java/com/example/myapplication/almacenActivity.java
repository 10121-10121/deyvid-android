package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;

public class almacenActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lstvProductos;

    private String nombres [] = {"pulsera", "collares", "cigarro electronico", "pipa de agua", "piercings"};
    private Number cantidad [] = {1, 4, 45, 12, 45};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacen);

        tv1 = (TextView)findViewById(R.id.tv1);
        lstvProductos = (ListView)findViewById(R.id.lstvProductos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.lista_productos, nombres);
        lstvProductos.setAdapter(adapter);

        lstvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("hay" + lstvProductos.getItemIdAtPosition(position) + cantidad[position]);
            }
        });

    }
}