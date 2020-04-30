package com.syntax.class02;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.navigate().to("https:/www.google.com");
		driver.navigate().back();
		driver.navigate().to("https://www.amazon.com");
		
	

	}

}
