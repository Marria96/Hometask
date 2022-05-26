package com.company;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 10;
        this.width = 10;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //площа прямокутника
    public int getSquare(){
        return length * width;
    }

    //периметир прямокутника
    public int getPerimeter(){
        return 2*(length + width);
    }
}
