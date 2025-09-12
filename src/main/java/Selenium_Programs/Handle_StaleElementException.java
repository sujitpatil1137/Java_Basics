package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_StaleElementException {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");

        WebElement element = driver.findElement(By.xpath("//a[@title='Live Cricket Score' and text()='Live Scores']"));

        for (int i=0; i<3; i++)
        {
            try {
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                element.click();
            }
        }
        driver.quit();
    }
}
