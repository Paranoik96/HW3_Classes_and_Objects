package com.cursor.objects;

import com.cursor.objects.car.Car;
import com.cursor.objects.circle.Circle;
import com.cursor.objects.counter.InstanceCounter;

public class Application {
    public static void main(String[] args) {

        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("Amount of created instances : " + InstanceCounter.getNumOfInstance());

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
