package Homework3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseTwo extends StartAndEndWithVariable {

    @Test (priority = 1)
    public void newReleases() {
        chromeDriver.findElement(By.xpath(tNewRelease)).click();
    }
    @Test (priority = 2)
    public void appAndGames(){
        chromeDriver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/li[4]/a")).click();
    }
    @Test (priority = 3)
    public void firstApp(){
        chromeDriver.findElement(By.xpath("//*[@id=\"zg-ordered-list\"]/li[1]/span/div/span/a/div")).click();
    }

}
