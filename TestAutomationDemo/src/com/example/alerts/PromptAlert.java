package com.example.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("http://www.selenium.dev/selenium/web/alerts.html");
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
		ele.click();
		
//		explicit wait
		WebDriverWait web_driver=new WebDriverWait(driver, Duration.ofSeconds(6));
		web_driver.until(ExpectedConditions.alertIsPresent());
		
		Alert al=driver.switchTo().alert();
		al.sendKeys("selenium web");
		al.accept();

	}

}
