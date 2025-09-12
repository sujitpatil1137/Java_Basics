package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class File_Download {

    public static void main(String[] args) throws InterruptedException {

        String downloadPath = "C:\\Users\\Admin\\Downloads";

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.enabled", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.xpath("//a[text()='luminoslogo.png']")).click();
        Thread.sleep(5000);
        System.out.println("File Downloaded Successfully...");

        File file = new File(downloadPath + "\\luminoslogo.png");
        if(file.exists())
        {
            System.out.println("Download verified!");
        }

    }
}
