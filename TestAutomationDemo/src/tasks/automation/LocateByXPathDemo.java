package tasks.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 2. Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        // Absolute XPath (not recommended in real life, but for demo):
        WebElement adminMenuAbs = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
        adminMenuAbs.click();

        // Relative XPath (recommended):
        WebElement adminMenuRel = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminMenuRel.click();

	}

}
