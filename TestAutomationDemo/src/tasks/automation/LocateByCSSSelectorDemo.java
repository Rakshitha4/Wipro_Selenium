package tasks.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 2. Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search']"));
        searchBox.sendKeys("Admin");

        // Close browser
        driver.quit();

	}

}
