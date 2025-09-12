package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MultiSelect_Dropdown_Handling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[text()='Teams']"));
        actions.moveToElement(element).perform();

        List<WebElement> teamList = driver.findElements(By.xpath("//a[@class='cb-subnav-item cb-sub-lg-sec-item']"));
        System.out.println("Total Teams: " + teamList.size());

        // Teams you want to select
        List<String> teamsToSelect = Arrays.asList("India", "Australia", "England");

        for (String teamName : teamsToSelect) {
            for (WebElement team : teamList) {
                if (team.getText().contains(teamName)) {
                    team.click();
                    System.out.println("Clicked: " + teamName);

                    // Re-hover dropdown again before selecting next value
                    Thread.sleep(2000);
                    actions.moveToElement(element).perform();
                    teamList = driver.findElements(By.xpath("//a[@class='cb-subnav-item cb-sub-lg-sec-item']"));
                    break;
                }
            }
        }
        driver.quit();

    }
}
