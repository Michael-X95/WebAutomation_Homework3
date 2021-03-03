package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseNine extends StartAndEndWithVariable {

    @Test (priority = 1)
    public void hoverOver() throws InterruptedException {

        WebElement gifts = chromeDriver.findElement(By.linkText("Prime"));
        Actions actions = new Actions(chromeDriver);
        actions.moveToElement(gifts).build().perform();
        Thread.sleep(5000);

    }

    @Test (priority = 2)
    public void asd() throws InterruptedException {
        hoverOver();
        chromeDriver.findElement(By.linkText("Try Prime")).click();
        Thread.sleep(5000);
    }
}
