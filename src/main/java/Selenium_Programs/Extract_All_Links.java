package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Extract_All_Links {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " +allLinks.size());

        for (WebElement link : allLinks)
        {
           String text = link.getText();
           String href = link.getAttribute("href");
            System.out.println("Text: " + text + " | URL: " + href);
        }
        driver.quit();
    }
}
