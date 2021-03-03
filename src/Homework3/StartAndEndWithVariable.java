package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class StartAndEndWithVariable {

    WebDriver chromeDriver;
    String amazonURL = "https://www.amazon.com/";
    String searchBox = "twotabsearchtextbox";
    String clickSearch = "nav-search-submit-button";
    String tTodaysDeal = "//*[@id=\"nav-xshop\"]/a[2]";
    String tNewRelease = "//*[@id=\"nav-xshop\"]/a[5]";
    String tAmazonHome = "//*[@id=\"nav-xshop\"]/a[12]";

    String lAllIcon = "hm-icon-label"; //class name
    String lAllIconNewRelease = "//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a";
    String lAllSeeAll = "//*[@id=\"hmenu-content\"]/ul[1]/li[21]/a[1]";

    String lAllIconSeeAllSmartHome = "//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[4]/a/i";

    JavascriptExecutor js = (JavascriptExecutor) chromeDriver;



     @BeforeTest
    public void setUP() {
        String chromeDriverPath = "chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        chromeDriver = new ChromeDriver();
        chromeDriver.get(amazonURL);
    }
    
    @AfterTest
    public void theEnd() throws InterruptedException {
        Thread.sleep(5000);
        chromeDriver.quit();
                
}
}
