package v4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    ExtentReports extent;
    ExtentTest test;
    WebDriver driver;

    @BeforeTest
    public void startReport() {
        // Start Extent Report
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
        extent.attachReporter(spark);

        // Start browser
        driver = new ChromeDriver();
    }

    @Test
    public void demoReport() {
        test = extent.createTest("Google Test");
        driver.get("https://google.com");
        test.pass("Opened Google Successfully");
    }

    @AfterTest
    public void endReport() {
        driver.quit();
        test.info("Browser closed");
        extent.flush();
    }
}