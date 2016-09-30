package com.valtech.test.home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * Created by nasirahmed on 29/09/2016.
 */
public class HomePageTest
{
    WebDriver driver;
    HomePage homePage;
    ServicesPage servicesPage;
    CasesPage casesPage;
    JobsPage jobsPage;

    @BeforeTest
    public void setUp()
    {
  //       System.setProperty("webdriver.chrome.driver","C:\\Automation\\chrome\\chromedriver.exe");

  //       driver = new ChromeDriver();
           driver = new FirefoxDriver();

        homePage = new HomePage(driver);
        servicesPage = new ServicesPage(driver);
        casesPage = new CasesPage(driver);
        jobsPage = new JobsPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.valtech.com/");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
    }

    @Test
    public void findTextInHomePage()
    {

        assertEquals(homePage.getHeaderText(),"LATEST NEWS");


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)", "");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        homePage.clickGlyphIcon();

        assertEquals("Cases",homePage.getLinkTextCases());
        assertEquals("Services",homePage.getLinkTextServices());
        assertEquals("Jobs",homePage.getLinkTextJobs());

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/div[1]/ul/li[1]/a")));
        homePage.selectCasesPage();
        assertEquals("Cases",casesPage.getHeaderText());

        homePage.clickGlyphIcon();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/div[1]/ul/li[3]/a")));
        casesPage.clickServicesLink();
        assertEquals("Services",servicesPage.getHeaderElement());

        homePage.clickGlyphIcon();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/div[2]/ul/li[1]/a")));
        homePage.selectJobsPage();
        assertEquals("Jobs",jobsPage.getHeaderElement());

        driver.findElement(By.xpath("//*[@id=\"contacticon\"]/div/div/div[1]/i")).click();

        List<WebElement> allLinkElements = driver.findElements(By.xpath("//*[@id=\"contactbox\"]/div//a"));

        int locations=0;

        for (WebElement element: allLinkElements)
        {
            if(element.getAttribute("href").contains("contact-us"))
            {
                locations++;
            }
        }

        System.out.println(String.format("Number of Office Locations - %d",locations));




    }
}
