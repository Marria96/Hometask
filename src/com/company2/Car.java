package com.company2;

public class Car {
    private int price;
    private int number_of_seats;
    private Helm helm;
    private Wheel wheel;
    private CarBody carBody;


    public Car() {
        this.price = price;
        this.number_of_seats = number_of_seats;
        this.helm = helm;
        this.wheel = wheel;
        this.carBody = carBody;
    }

    public int setPrice(int number_of_seats,int price){
        if(number_of_seats == 2){
            price = price * 10;
        }else if(number_of_seats == 4){
            price = price;
        }
        return price;
    }

    public int priseIncrease(int price){
        for(int i = 1; i < 11; i++){
            price = price+100;
        }
        return price;
    }

    public Helm getHelm() {
        return helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", number_of_seats=" + number_of_seats +
                ", helm=" + helm +
                ", wheel=" + wheel +
                ", carBody=" + carBody +
                '}';
    }
}
