package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseFive extends StartAndEndWithVariable{


    @Test
    public void testcasefive(){
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.className(lAllIcon)).click();
        chromeDriver.findElement(By.xpath(lAllIconNewRelease)).click();

    }
}
