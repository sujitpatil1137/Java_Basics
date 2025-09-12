package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Handling_Frames {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");

        Thread.sleep(3000);
        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total Frames: " +totalFrames.size());

        //Using Index
        driver.switchTo().frame(1);
        driver.switchTo().defaultContent();

        //Using Name
        driver.switchTo().frame("__tcfapiLocator");
        driver.switchTo().defaultContent();

        //Using WebElement
        WebElement element = driver.findElement(By.xpath("//iframe[@name='googlefcPresent']"));
        driver.switchTo().frame(element);
        driver.switchTo().defaultContent();

        driver.quit();

    }
}
