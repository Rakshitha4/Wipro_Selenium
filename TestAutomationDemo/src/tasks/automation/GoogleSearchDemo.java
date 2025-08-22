package tasks.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class GoogleSearchDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.google.com");

        // Accept cookies if present
        try {
            WebElement agreeBtn = driver.findElement(By.xpath("//button[contains(.,'I agree')]"));
            agreeBtn.click();
        } catch (Exception e) {}

        // Search for Selenium WebDriver
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        Thread.sleep(2000); // wait for results

        // Handle result stats dynamically
        WebElement resultStats = null;
        try {
            resultStats = driver.findElement(By.id("result-stats"));
        } catch (Exception e1) {
            resultStats = driver.findElement(By.xpath("//div[contains(text(),'results')]"));
        }

        System.out.println("Search Results: " + resultStats.getText());

        driver.quit();
    }
}
