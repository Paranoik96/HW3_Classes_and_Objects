package com.cursor.objects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
    private final String model;
    private int speed;
    private boolean engineStart;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineStart() {
        return engineStart;
    }

    public void setEngineStart(boolean engineStart) {
        this.engineStart = engineStart;
    }

    protected void start() {
        if (isEngineStart()) {
            System.out.println("Engine is already working.");
        } else {
            setEngineStart(true);
            System.out.println("Ignition on, Engine starts working.");
        }
    }

    protected void stop() {
        Scanner sc = new Scanner(System.in);
        if (isEngineStart()) {
            if (getSpeed() == 0) {
                setEngineStart(false);
                System.out.println("Engine is stopped.");
            } else {
                System.out.println("Change your Current Speed to 0 for safety stop! ");
                while (sc.nextInt() != 0){
                    System.out.println("CHANGE your Current Speed to 0 for safety stop! ");
                }
                speed = 0;
                System.out.println("Engine is stopped.");
            }
        } else {
            System.out.println("Engine does not work.");
        }
    }

    protected void moveVehicle(int wantedSpeed) {
        if (isEngineStart()) {
            if (wantedSpeed > 0) {
                speed = wantedSpeed;
                System.out.println("Current speed is :" + getSpeed());
            } else {
                System.out.println("Vehicle not moving.");
            }
        } else {
            System.out.println("Engine is does not work.");
        }
    }
}


