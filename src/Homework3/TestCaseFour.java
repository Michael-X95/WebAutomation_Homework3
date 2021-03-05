package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseFour extends StartAndEndWithVariable {

    @Test(priority = 1)
    public void allTab() {
        chromeDriver.findElement(By.className(lAllIcon)).click();
    }

    @Test(priority = 2)
    public void scrollDownToElement() {
        Actions actions = new Actions(chromeDriver);
        WebElement elementLocator = chromeDriver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a"));
        actions.contextClick(elementLocator).perform();

    }
}
