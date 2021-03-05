package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseFive extends StartAndEndWithVariable{


    @Test
    public void allAndNewRelease(){
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.className(lAllIcon)).click();
        chromeDriver.findElement(By.xpath(lAllIconNewRelease)).click();

    }

}
