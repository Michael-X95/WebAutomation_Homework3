package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseSix extends StartAndEndWithVariable{

    @Test
    public void testcasesix(){
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.className(lAllIcon)).click();
      //  js.executeScript("windows.scrollBy(0,1000)");
        chromeDriver.findElement(By.xpath(lAllSeeAll)).click();
    }
}
