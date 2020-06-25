package com.cursor.objects.car;

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

    static class MyScanner {
        private static final Scanner scan = new Scanner(System.in);

        private MyScanner() {
        }

        public static Scanner getInstance() {
            return scan;
        }
    }

    public void start() {
        if (engineStart) {
            System.out.println("Engine is already working.");
        } else {
            engineStart = true;
            System.out.println("Ignition on, Engine starts working.");
        }
    }

    public void stop() {
        if (engineStart) {
            if (getSpeed() == 0) {
                engineStart = false;
                System.out.println("Vehicle is stopped.");
            } else {
                System.out.println("Change your Current Speed to 0 for safety stop! ");
                while (MyScanner.getInstance().nextInt() != 0) {
                    System.out.println("CHANGE your Current Speed to 0 for safety stop! ");
                }
                speed = 0;
                System.out.println("Vehicle stopped.");
            }
        } else {
            System.out.println("Engine does not work.");
        }
    }

    public void moveVehicle(int wantedSpeed) {
        if (engineStart) {
            if (wantedSpeed > 0) {
                speed = wantedSpeed;
                System.out.println("Current speed is :" + getSpeed());
            } else {
                System.out.println("Vehicle not moving.");
            }
        } else {
            System.out.println("Engine does not work.");
        }
    }
}


