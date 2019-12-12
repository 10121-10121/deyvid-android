package com.example.myapplication.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Productos {
    public String name;
    public String description;

    public Productos(String _name, String _desc) {
        this.name = _name;
        this.description = _desc;
    }

    public String toString() {
        return this.name;
    }

    public static ArrayList<Productos> getData() {
        ArrayList <Productos> productos = new ArrayList<>();
        productos.add(new Productos(
            "galletitas", "galletas deliciosas"
        ));
        productos.add(new Productos(
            "Wafer", "Nick"
        ));
        return productos;
    }

}
