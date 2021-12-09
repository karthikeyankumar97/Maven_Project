package com.BaseClass;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {
	public static WebDriver driver;
	public static Actions act;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
		     driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"//Driver//firefoxdriver.exe");
			 driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}
	

	public static void geturl(String url) {
		driver.get(url);

	}
	
	
	public static void moveactions(WebElement element) {
		 act = new Actions(driver);
		 act.moveToElement(element).build().perform();
		 
		

	}
	public static void scrolldown(WebElement element) {
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element);

	}
	
	public static void screenshot() throws IOException {
		 ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Selenium_Concepts\\Screenshot/picture.png");
			FileUtils.copyFile(src, dest);
	}
	public static void implicitwait(int number) {
		driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);

	}

	public static void clickonelement(WebElement element) {
		element.click();
		

	}
	public static void threadsleep(int num) throws InterruptedException {
	Thread.sleep(num);

	}
	public static void clickonelement1(WebElement element) {
		element.click();
		

	}
	public static void clickonelement2(WebElement element) {
		element.click();
		

	}
	public static void clickonelement3(WebElement element) {
	element.click();
	}
	public static void clickonelement4(WebElement element) {
		element.click();
		}
	public static void email(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void password(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void clickonelement5(WebElement element) {
		element.click();
		

	}
	public static void clickonelement6(WebElement element) {
		element.click();
		

	}
	public static void clickonelement7(WebElement element) {
		element.click();
		

	}
	public static void clickonelement8(WebElement element) {
		element.click();
		

	}
	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}
}

