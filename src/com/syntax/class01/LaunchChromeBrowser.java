package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChromeBrowser {

	public static void main(String[] args) {
		//Making connection to the driver
		System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver");
        //Opening the browser by calling the constructor of ChromeDriver class and upcasting
		WebDriver drive=new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.get)
	}

}
