package com.myOwnPractice.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // in this class we will implement the repeated steps of reading
    // from configuration file

    //#1 - Create the object of Property File
    private static Properties properties = new Properties();
    static {
        //#2 - Get the object of the Path and open the file
        try{
            FileInputStream file= new FileInputStream("configuration.properties");

            //#3 -Load the opened file into properties object
            properties.load(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // #4 - Use the object to read from the configuration.properties file
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
