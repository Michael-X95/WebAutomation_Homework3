package Homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCaseSeven extends StartAndEndWithVariable {

    @Test(priority = 1)
    public void scrollingToElement() throws InterruptedException {
        chromeDriver.manage().window().maximize();
        WebElement bottomPageElement = chromeDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[8]/a"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", bottomPageElement);
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void languageTab() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//*[@id=\"icp-touch-link-language\"]/span[1]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void clickEspanol() throws InterruptedException {
        chromeDriver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/div/div[1]/div[2]/div/label/i")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void clickEnglish() {
        chromeDriver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/div/div[1]/div[1]/div/label/i")).click();
    }

    @Test (priority = 5)
    public void saveChanges(){
        chromeDriver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input")).click();
    }
}
