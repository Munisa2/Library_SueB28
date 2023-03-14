package com.librarySueB28.stepDefs;

import com.librarySueB28.pages.LoginPage;
import com.librarySueB28.utilities.ConfigurationReader;
import com.librarySueB28.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login_StepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("librarian")){
            username = ConfigurationReader.getProperty("librarian_username");
            password = ConfigurationReader.getProperty("librarian_password");
        }
        if (userType.equalsIgnoreCase("student")){
            username = ConfigurationReader.getProperty("student_username");
            password = ConfigurationReader.getProperty("student_password");
        }

        new LoginPage().login(username,password);



    }


}
