package tasks.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMEndToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 1. Open OrangeHRM Demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // 2. Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();

        // 3. Navigate to PIM section
        driver.findElement(By.xpath("//span[text()='PIM']")).click();

        // 4. Add new employee
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        driver.findElement(By.name("firstName")).sendKeys("Lily");
        driver.findElement(By.name("lastName")).sendKeys("Sam");

        // Upload photo
        WebElement uploadPhoto = driver.findElement(By.cssSelector("input[type='file']"));
        uploadPhoto.sendKeys("C:\\\\Users\\\\Rakshitha\\\\Pictures\\\\profile.jpg"); // <-- change to your local file path

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // 5. Verify employee in list
        driver.findElement(By.xpath("//span[text()='Employee List']")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // wait for list to load
        WebElement searchBox = driver.findElement(By.xpath("//label[text()='Employee Name']/../following-sibling::div//input"));
        searchBox.sendKeys("Lily Sam");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        WebElement empRecord = driver.findElement(By.xpath("//div[@role='row']//div[text()='Lily']"));
        if (empRecord.isDisplayed()) {
            System.out.println("✅ Employee added successfully!");
        } else {
            System.out.println("❌ Employee not found!");
        }

        // 6. Logout
        driver.findElement(By.cssSelector("p.oxd-userdropdown-name")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        // Close browser
        driver.quit();

	}

}
