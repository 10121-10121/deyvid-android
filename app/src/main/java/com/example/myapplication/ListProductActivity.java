package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapters.ProductAdapter;
import com.example.myapplication.models.Productos;

public class ListProductActivity extends AppCompatActivity {

    ListView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        productList = findViewById(R.id.listaproductos);

        ProductAdapter adapter = new ProductAdapter(this, Productos.getData());

        productList.setAdapter(adapter);

    }
}
