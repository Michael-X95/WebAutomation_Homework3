package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseOne extends StartAndEndWithVariable{


    @Test
    public void testcase1() {

    chromeDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();

    }
}
