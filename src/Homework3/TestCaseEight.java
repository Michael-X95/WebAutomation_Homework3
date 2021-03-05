package Homework3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseEight extends StartAndEndWithVariable {

    @Test
    public void scrollingDownAndUp() throws InterruptedException {
        chromeDriver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver; //must be inside Testing.
        js.executeScript("window.scrollBy(0,2500)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1000)");

    }


}
