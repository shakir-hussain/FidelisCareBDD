package com.stepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shaki\\eclipse-workspace\\FidelisCareBDD\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fideliscare.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
