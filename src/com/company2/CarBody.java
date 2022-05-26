package com.company2;

public class CarBody {
    private String color = "Синій";

    public CarBody(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "color='" + color + '\'' +
                '}';
    }

    public void colorBody(String color){
        System.out.println("Колір кузова машини = " + color);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

