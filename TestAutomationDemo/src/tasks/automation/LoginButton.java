package tasks.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 // Validation
		 if (driver.getTitle().equals("OrangeHRM")) {
		 System.out.println("Login Successful");
		 } else {
		 System.out.println("Login Failed");
		 }
		 driver.quit();

	}

}
