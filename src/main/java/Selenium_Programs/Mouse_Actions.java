package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");
        WebElement element = driver.findElement(By.xpath("//a[@title='Live Cricket Score']"));
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();

        driver.get("https://demoqa.com/droppable");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
       // actions.dragAndDrop(source,target).perform();
        actions.clickAndHold(source).moveToElement(target).release().perform();

        //perform() → for single/simple actions (hover, click, drag).
        // build().perform() → for complex sequences (multiple actions in order).

    }
}
