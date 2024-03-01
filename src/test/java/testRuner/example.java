package testRuner;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class example {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("https://www.google.com/");
//        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//        webElement.sendKeys("aaa");
//        webElement.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//        webDriver.close();
//        webDriver.quit();
//    }
    public static example instance = null;

    WebDriver driver;
    public example(){
    }
    public example getIns(){
        if(instance == null){
            instance = new example();
        }
        return instance;
    }
    public void setExample(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }
    public void getExample(){

    }
}
