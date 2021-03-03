package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestCaseSplit extends TestCaseSplitVariables {


    @Test(priority = 1)
    public void test1() {
        chromeDriver.get(amazonURL);
        chromeDriver.findElement(By.id(searchBox)).sendKeys("iphone");
        chromeDriver.findElement(By.id(clickSearch)).click();
    }
    @Test(priority = 2)
    public void test2() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//*[@id=\"p_89/Apple\"]/span/a/div/label/i")).click();
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void test3() throws InterruptedException {
        chromeDriver.findElement(By.linkText("Apple iPhone 8, 64GB, Space Gray - Fully Unlocked (Renewed)")).click();
        // chromeDriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(4000);
    }
    @Test(priority = 5)
    public void test4() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void test5() throws InterruptedException {
        chromeDriver.findElement(By.id("ap_email")).sendKeys("freephone@gmail.com",Keys.RETURN);
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void noThanks() throws InterruptedException {
        chromeDriver.findElement(By.id("attachSiNoCoverage-announce")).click();
        Thread.sleep(3000);
    }

}
