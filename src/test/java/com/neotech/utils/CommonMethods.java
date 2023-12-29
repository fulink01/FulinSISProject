package com.neotech.utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
}
