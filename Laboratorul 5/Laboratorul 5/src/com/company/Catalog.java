package com.company;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
;

public class Catalog {
    private String name;
    private String path;
    private List<Item> listaItemi = new ArrayList<>();

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
        System.out.println("Ai creat catalogul " + this.name);
    }

    public void add(Item entry)
    {
        this.listaItemi.add(entry);
        System.out.println("Ai adaugat " + entry.name + " la catalog");
    }



    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", listaItemi=" + listaItemi +
                '}';
    }

    public void list()
    {
        System.out.println(Arrays.toString(this.listaItemi.toArray()));
    }

    public String getPath() {
        return this.path;
    }



        public static void save() throws IOException {
            try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(this.getPath()))) {
                oos.writeObject(this.name);
            }
        }

}

