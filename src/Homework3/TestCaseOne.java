package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseOne extends StartAndEndWithVariable {

    @Test (priority = 1)
    public void todaysDeal() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        Thread.sleep(2000);

    }
    @Test (priority = 2)
    public void checkBoxBooks() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[7]/div/label/input")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void lightningDeals(){
        chromeDriver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[2]/span[2]/div/a")).click();
    }
}
