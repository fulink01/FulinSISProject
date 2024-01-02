package com.neotech.utils;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.testbase.BaseClass;

public class CommonMethods extends BaseClass {

	public static void sendText(WebElement element, String text) {

		element.clear();
		element.sendKeys();
	}

	public static void clickBox(List<WebElement> elementList, String selectValue) {

		for (WebElement el : elementList) {
			String value = el.getAttribute("value").trim();

			if (value.equals(selectValue) && el.isEnabled()) {
				el.click();
				break;
			}
		}
	}

	public static void selectDropdown(WebElement el, String visibleText) {

		Select sel = new Select(el);
		sel.selectByVisibleText(visibleText);
	}

	public static void acceptAlert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static String getAlertText() {

		String alertText = null;

		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		return alertText;

	}

	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToWindow() {

		String mainWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!mainWindow.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

	}

	public static WebDriverWait getWaitObject() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
		return wait;

	}

	public static WebDriverWait getWaitObject(int secondsToWait) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
		return wait;
	}

	public static WebElement waitClickability(WebElement element) {

		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitVisibilty(WebElement element) {

		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	public static void click(WebElement element) {
		waitClickability(element);
		element.click();
	}

	public static JavascriptExecutor getJSObject() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public static void jsClick(WebElement element) {

		getJSObject().executeScript("arguments[0].click()", element);
	}

	public static byte[] takeScreenShot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] pic = ts.getScreenshotAs(OutputType.BYTES);
		return pic;
	}
	
	public static String getTimeStamp() {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

		return sdf.format(date);
	}
	
	public static void loadPicture(WebElement drag, WebElement drop) {
		
		Actions action = new Actions(driver);
		
		try {
			action.dragAndDrop(drag, drop).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDateFromCalendar(List<WebElement> elements , String date) {
		
		for(WebElement day : elements) {
			if(day.getText().equals(date)) {
				if(day.isEnabled()) {
					day.click();
					break;
				}
			}
		}
		
	}

}
