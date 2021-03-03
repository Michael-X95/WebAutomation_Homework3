package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseTwo extends StartAndEndWithVariable {


    @Test
    public void testcasetwo(){
        chromeDriver.findElement(By.xpath(tNewRelease)).click();
    }
}
