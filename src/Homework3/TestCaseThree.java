package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestCaseThree extends StartAndEndWithVariable {

    @Test(priority = 1)
    public void amazonHome() throws InterruptedException {
        chromeDriver.manage().window().maximize(); // have to maximize to work
        chromeDriver.findElement(By.xpath(tAmazonHome)).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void scrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver; //must be inside Testing.
        js.executeScript("window.scrollBy(0,2500)");
    }

    @Test(priority = 2)
    public void bedAndBath() {
        chromeDriver.findElement(By.linkText("Bed & Bath")).click();

    }
}
