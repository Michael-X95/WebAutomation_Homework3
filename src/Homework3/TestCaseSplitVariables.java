package Homework3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import javax.xml.xpath.XPath;

public class TestCaseSplitVariables {

    WebDriver chromeDriver;
    String amazonURL = "https://www.amazon.com/";
    String searchBox = "twotabsearchtextbox";
    String clickSearch = "nav-search-submit-button";




    @BeforeTest
    public void setUP() {
        String chromeDriverPath = "chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        chromeDriver = new ChromeDriver();
    }
    @AfterTest
    public void theEnd() throws InterruptedException {
        Thread.sleep(5000);
        chromeDriver.quit();
    }}