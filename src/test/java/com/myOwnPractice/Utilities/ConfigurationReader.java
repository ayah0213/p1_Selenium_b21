package com.myOwnPractice.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // in this class we will implement the repeated steps of reading and loading
    // properties file and provide an access to values based on keys


    //#1 - Create the object of Property File
    private static Properties properties = new Properties();
    static {
        //#2 - Get the object of the Path and open the file
        // try catch block stands for handling exceptions
        // if exceptiions occurs, code inside a catch block will be excecuted
        // any class that is related to InputOutput produce checked exceptions
        // without handling checked exceptions, we cant run teh code
        try{
            //this is a class which allows us to connect with properties file and get inform.from it
            FileInputStream fileInputStream= new FileInputStream("configuration.properties");
            //#3 -Load the opened file into properties object
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("File wasnt loaded");
            e.printStackTrace();
        }
    }
    // #4 - Use the object to read from the configuration.properties file
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
