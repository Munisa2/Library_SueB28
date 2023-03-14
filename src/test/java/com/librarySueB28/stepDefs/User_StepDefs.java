package com.librarySueB28.stepDefs;

import com.librarySueB28.pages.UserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class User_StepDefs {

    UserPage user = new UserPage();

    @And("I click on User link")
    public void iClickOnUserLink() {

        user.userLink.click();

    }
}
