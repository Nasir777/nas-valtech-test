package com.valtech.test.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by nasirahmed on 29/09/2016.
 */
public class ServicesPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"container\"]/section/header/h1")
    WebElement headerElement;

    public ServicesPage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public String getHeaderElement(){
        return headerElement.getText();
    }

}
