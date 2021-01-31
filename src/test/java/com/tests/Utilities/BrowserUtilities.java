package com.tests.Utilities;

public class BrowserUtilities {
    //creating method name: wait
    //converting to miliseconds
    // handle checked exception

    public static void sleep(int second) {
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){
            System.out.println("somethings happened in sleep method");
        }
    }
}
