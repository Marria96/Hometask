package com.company2;

public class Helm {
    private int diameter = 26;

    public Helm(int diameter) {
        this.diameter = diameter;
    }


    public int getDiameter() {
        diameter = diameter*2;
        System.out.println("Новий розмір керма = " + diameter);
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
