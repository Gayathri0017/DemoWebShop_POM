package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CheckOutPage {
	@FindBy(xpath="//select[@id=\"CountryId\"]")
	public WebElement cId;
	@FindBy(id="termsofservice")
	public WebElement terms;
	@FindBy(id="checkout")
	public WebElement ckout;
	
}
