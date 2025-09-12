package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AutoSuggestions_Handling {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("disable-features=ChromeCredentialProvider,PasswordManagerOnboarding");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();

        WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        googleSearchBox.sendKeys("Selenium");

        Thread.sleep(2000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        System.out.println("Total Search: " +suggestions.size());

        for (int i=0; i<suggestions.size(); i++)
        {
           WebElement element = suggestions.get(i);
            System.out.println(element.getText());
        }

    }
}
