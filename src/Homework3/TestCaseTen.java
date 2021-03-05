package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseTen extends StartAndEndWithVariable {

    @Test(priority = 1)
    public void scrollingToElement() throws InterruptedException {
        chromeDriver.manage().window().maximize();
        WebElement bottomPageElement = chromeDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[8]/a"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", bottomPageElement);
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void hoverLanguage() throws InterruptedException {
        WebElement gifts = chromeDriver.findElement(By.xpath("//*[@id=\"icp-touch-link-language\"]"));
        Actions actions = new Actions(chromeDriver);
        actions.moveToElement(gifts).build().perform();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void rightClick(){
        Actions actions = new Actions(chromeDriver);
        WebElement elementLocator = chromeDriver.findElement(By.xpath("//*[@id=\"nav-flyout-icp-footer-flyout\"]/div[2]/a[2]/span/div"));
        actions.contextClick(elementLocator).perform();
    }

}