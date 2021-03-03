package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseFour extends StartAndEndWithVariable {

    @Test
    public void testcasefour(){
        chromeDriver.findElement(By.className(lAllIcon)).click();
    }
}
