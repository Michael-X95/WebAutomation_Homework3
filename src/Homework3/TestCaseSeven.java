package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCaseSeven extends StartAndEndWithVariable {

    @Test
    public void scrollingToElement() {
        chromeDriver.manage().window().maximize();
        WebElement bottomPageElement = chromeDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[8]/a"));
        ((JavascriptExecutor)chromeDriver).executeScript("arguments[0].scrollIntoView(true);",bottomPageElement);
    }
}
