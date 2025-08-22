package tasks.automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 2. Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total hyperlinks on dashboard: " + allLinks.size());
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + " -> " + link.getAttribute("href"));
        }

	}

}
