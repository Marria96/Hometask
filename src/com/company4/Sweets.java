package com.company4;

public class Sweets {
    private String name;

    public Sweets(String name) {
        this.name = name;
    }

    public Sweets() {
    }

    public void getName(String name) {
        System.out.println("Це солодощі,а саме " + name);
    }
    public void getName(){
        System.out.println("Ура це солодощі!");
    }

    public void setName(String name) {
        this.name = name;
    }
}
