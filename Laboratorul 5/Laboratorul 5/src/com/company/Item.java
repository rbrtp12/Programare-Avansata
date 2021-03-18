package com.company;

public abstract class Item {
    protected String name;
    protected int size; // item's size in MB

    public Item(String name, int size) {
        this.name = name;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
