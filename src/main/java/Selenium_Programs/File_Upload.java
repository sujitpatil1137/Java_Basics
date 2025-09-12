package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
        chooseFileBtn.sendKeys("C:\\Users\\Admin\\Downloads\\file-sample_100kB.doc");
        driver.findElement(By.id("file-submit")).click();
        System.out.println("File uploaded successfully!");

    }
}
