package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	 public static WebDriver driver;
		//BrowserLaunch
		public static void launchchrome() {
			driver = new ChromeDriver();
		}
		//Maximize Window
		public static void winMax() {
			driver.manage().window().maximize();
		}
		//loadUrl
		public static void Url(String url) {
			driver.get(url);
		}
		
		//get Title
		public static void printTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		//Sendkeys
		public static void sendkeys(WebElement element, String value ) {
			element.sendKeys(value);
		}
		//Click
		public static void click(WebElement element) {
			element.click();
			}
		//Current Url
		public static void currentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		//Select by value
		public static void selectByValue(String value, WebElement element) {
			Select S = new Select(element);
			S.selectByValue(value);
		}
		//Select by VisibleText
		public static void selectByVisibleText(String text, WebElement element) {
			Select S = new Select(element);
			S.selectByVisibleText(text);
		}
		//Select by Index
		public static void selectByIndex(int index, WebElement element) {
			Select S = new Select(element);
			S.selectByIndex(index);
		}
		//Date format
		public static void dateFormat() {
		}
		//refresh
		public static void refresh() {
			driver.navigate().refresh();
		}
		//close
		public static void close() {
			driver.close();
		}

}
