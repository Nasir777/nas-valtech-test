package com.valtech.test.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nasirahmed on 29/09/2016.
 */
public class HomePage
{
    WebDriver driver;

    @FindBy(css = "div.news-post__listing-header > header.block-header > h2.block-header__heading")
    WebElement header;

    @FindBy(id = "navigation-toggle")
    WebElement navigationToggle;


    @FindBy(xpath = "//*[@id=\"navigation-toggle-button\"]/div/div/div[1]/i")
    WebElement glyphIcon;

    @FindBy(xpath = "//*[@id=\"navigationMenuWrapper\"]/div/div[1]/ul/li[1]/a")
    WebElement linkTextCases;

    @FindBy(xpath = "//*[@id=\"navigationMenuWrapper\"]/div/div[1]/ul/li[3]/a")
    WebElement linkTextServices;

    @FindBy(xpath = "//*[@id=\"navigationMenuWrapper\"]/div/div[2]/ul/li[1]/a")
    WebElement linkTextJobs;

    @FindBy(css = "div.center-child")
    WebElement  centerChildBtn;

    @FindBy(css = "i.icons.glyph")
    WebElement glyphIconInner;

    @FindBy(id = "contactbox")
    WebElement contactBox;

    public HomePage(WebDriver webDriver)
    {
        this.driver = webDriver;

        PageFactory.initElements(driver,this);
    }

    public String getHeaderText()
    {
        return header.getText();
    }

    public void toggleNavigation()
    {
        navigationToggle.click();
    }

    public void clickGlyphIcon()
    {
        glyphIcon.click();
    }

    public String getLinkTextCases()
    {
        return linkTextCases.getAttribute("title");
    }

    public void selectCasesPage(){
        linkTextCases.click();
    }

    public String getLinkTextServices()
    {
        return linkTextServices.getAttribute("title");
    }

    public void selectServicesPage(){
        linkTextServices.click();
    }

    public String getLinkTextJobs(){
        return  linkTextJobs.getAttribute("title");
    }

    public void selectJobsPage(){
        linkTextJobs.click();
    }

    public void clickCentreChild()
    {
        centerChildBtn.click();
    }

    public void clickGlyphIcon2()
    {
        glyphIconInner.click();
    }

    public String getContactBoxText()
    {
       return contactBox.getText();
    }

}
