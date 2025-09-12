package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class Handling_WindowsOrTabs {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        WebElement news = driver.findElement(By.xpath("//a[@class='sc-5eaafc6a-4 eeXkpK' and text()='News']"));
        WebElement sport = driver.findElement(By.xpath("//a[@class='sc-5eaafc6a-4 eeXkpK' and text()='Sport']"));
        WebElement arts = driver.findElement(By.xpath("//a[@class='sc-5eaafc6a-4 eeXkpK' and text()='Arts']"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(news).click(sport).click(arts).keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);

        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

         // We can switch using Page Title, By URL, By Handle Order

        //By URL:   if (driver.getCurrentUrl().contains(urlPart))
        // By Handle Order: List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(tabs.get(2)); // switch to 3rd tab

        for (String window : windows) {
            String title = "BBC News - Breaking news, video and the latest top stories from the U.S. and around the world";
            driver.switchTo().window(window);
            if (driver.getTitle().contains(title)) {
                System.out.println("Switched to tab: " + driver.getTitle());
                break;
            }
        }
    }
}
