package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Find_Broken_Links {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " +allLinks.size());

        for (WebElement link : allLinks) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("URL is empty or not found");
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();

                    if(responseCode >= 400) {
                        System.out.println("Broken Link: " +url+ " | Status: " +responseCode);
                    }
                    else {
                    System.out.println("Valid Link: " +url+ " | Status: " +responseCode);
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception for URL: " +url+ " --> " + e.getMessage());
                }
        }

        driver.quit();
    }
}
