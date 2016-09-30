package com.valtech.test.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Nasir Ahmed on 29/09/2016.

 */
public class CasesPage
{

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"container\"]/header/h1")
    WebElement headerElement;

    @FindBy(xpath = "//*[@id=\"navigationMenuWrapper\"]/div/div[1]/ul/li[3]/a")
    WebElement servicesLink;

    public CasesPage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public String getHeaderText(){
        return headerElement.getText();
    }

    public void clickServicesLink(){
        servicesLink.click();
    }


}
