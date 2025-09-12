package Selenium_Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " +alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Hello");
        alert.accept();
        driver.quit();
    }
}
