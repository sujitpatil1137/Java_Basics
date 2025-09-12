package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Dropdown_Without_Select_Class {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[text()='Teams']"));
        actions.moveToElement(element).perform();

        List<WebElement> teamList = driver.findElements(By.xpath("//a[@class='cb-subnav-item cb-sub-lg-sec-item']"));
        System.out.println("Total Teams: " +teamList.size());

        for (WebElement team:teamList)
        {
            if(team.getText().contains("India"))
            {
                team.click();
                break;
            }
        }

        driver.quit();
    }
}
