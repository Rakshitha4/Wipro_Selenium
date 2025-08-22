package tasks.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 1. Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // 2. Enter username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // 3. Enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // 4. Click Login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        // 5. Verify title after login
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("✅ Login successful, Title matched: " + actualTitle);
        } else {
            System.out.println("❌ Login failed, Expected: " + expectedTitle + ", but got: " + actualTitle);
        }

        // 6. Close browser
        driver.quit();

	}

}
