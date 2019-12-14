package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapplication.almacenActivity;

public class menuActivity extends AppCompatActivity {

    ImageButton btnAlmacen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnAlmacen = findViewById(R.id.btnAlmacen);

        btnAlmacen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(menuActivity.this,
                        almacenActivity.class);
                startActivity(o);
            }
        });
    }
}
