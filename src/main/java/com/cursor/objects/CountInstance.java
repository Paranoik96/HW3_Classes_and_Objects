package com.cursor.objects;

public class CountInstance {

    private static int counter;

    public CountInstance() {
        counter++;
    }
    public static int getNumOfInstance(){
        return counter;
    }
}
