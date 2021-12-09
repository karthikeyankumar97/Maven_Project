package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Sec {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Faded Short Sleeve T-shirts']")
	WebElement name;

	public Tshirt_Sec(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return name;
	}
@FindBy(id="color_2")
WebElement color;

public WebElement getColor() {
	return color;
}
@FindBy(xpath="//a[@title='Add to cart']")
WebElement cart;

public WebElement getCart() {
	return cart;
}
@FindBy(xpath="//div[@id='layer_cart']/div/div[2]/div[4]/a/span")
WebElement btn;

public WebElement getBtn() {
	return btn;
}
}
