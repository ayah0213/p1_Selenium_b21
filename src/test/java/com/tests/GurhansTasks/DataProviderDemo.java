package com.tests.GurhansTasks;

import org.testng.annotations.DataProvider;


public class DataProviderDemo {

    @DataProvider(name = "loginCredentials")
    public Object[][] provideCredentials() {
        return new Object[][]{
                        {"marketing24@cybertekschool.com", "UserUser"},
                        {"marketing23@cybertekschool.com", "UserUser"},
                        {"hr23@cybertekschool.com", "UserUser"},
                        {"hr24@cybertekschool.com", "UserUser"},
                        {"helpdesk23@cybertekschool.com", "UserUser"},
                        {"helpdesk24@cybertekschool.com", "UserUser"}
        };
    }
}
