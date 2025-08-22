package tasks.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 2. Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        WebElement username = driver.findElement(By.id("txtUsername")); // old UI field (for compatibility)
        if (username == null) { // fallback for new UI
            username = driver.findElement(By.name("username"));
        }
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        if (password == null) { // fallback for new UI
            password = driver.findElement(By.name("password"));
        }
        password.sendKeys("admin123");

	}

}
