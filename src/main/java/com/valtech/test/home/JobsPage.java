package com.valtech.test.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nasirahmed on 29/09/2016.
 */
public class JobsPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/h1")
    WebElement headerElement;

    public JobsPage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public String getHeaderElement(){
        return headerElement.getText();
    }
}
