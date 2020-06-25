package com.cursor.objects.counter;

public class InstanceCounter {

    private static int counter;

    public InstanceCounter() {
        counter++;
    }
    public static int getNumOfInstance(){
        return counter;
    }
}
