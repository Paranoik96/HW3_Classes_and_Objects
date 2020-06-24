package com.cursor.objects;

public class Application {
    public static void main(String[] args) {

        new CountInstance();
        new CountInstance();
        new CountInstance();
        new CountInstance();
        System.out.println("Amount of created instances : " + CountInstance.getNumOfInstance());

        Car car = new Car("Mercedes-Benz GLC");
        System.out.println(car.getModel());
        car.start();
        car.moveVehicle(100);
        car.moveVehicle(123);
        car.moveVehicle(90);
        car.stop();
        car.stop();
        System.out.println(car.getSpeed());

        Circle circle = new Circle();
        circle.circleArea();
    }
}
