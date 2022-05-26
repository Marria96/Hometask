package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle rectangle = new Rectangle();
        System.out.println("Площа прямокутника = " + rectangle.getSquare());
        System.out.println("Периметр прямокутника = " + rectangle.getPerimeter());
    Rectangle rectangle1 = new Rectangle(23,12);
        System.out.println("Площа нового прямокутника = " + rectangle1.getSquare());
        System.out.println("Периметр нового прямокутника = " + rectangle1.getPerimeter());

    Circle circle = new Circle(13,26);
        System.out.println("Плоза кола = " + circle.getSquare());
        System.out.println("Довжина кола = " + circle.getLength());
    }
}
