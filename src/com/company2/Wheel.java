package com.company2;

public class Wheel {
    private int size = 13;

    public Wheel(int size) {
        this.size = size;
    }

    public  int getSizeWheel(int size){
        System.out.println("Розмір колеса = " + size);
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
