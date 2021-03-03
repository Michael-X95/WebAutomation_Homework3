package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseThree extends StartAndEndWithVariable{

    @Test
    public void testcasethree(){
        chromeDriver.manage().window().maximize(); // have to maximize to work
        chromeDriver.findElement(By.xpath(tAmazonHome)).click();
    }
}
