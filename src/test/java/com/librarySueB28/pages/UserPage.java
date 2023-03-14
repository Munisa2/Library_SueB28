package com.librarySueB28.pages;

import com.librarySueB28.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends BasePage{


    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;

}
