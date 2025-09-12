package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Select_SecondLastELement_fromDropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        WebElement countryDropdown = driver.findElement(By.tagName("Select"));
        Select select = new Select(countryDropdown);
        List<WebElement> options = select.getOptions();
        int total = options.size();

        int secondLastIndex = total-2;
        String secondLastText = options.get(secondLastIndex).getText();
        select.selectByIndex(secondLastIndex);
        System.out.println("Selected 2nd last option: " + secondLastText);

    }
}
