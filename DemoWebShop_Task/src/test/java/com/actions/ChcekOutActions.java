package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pages.CheckOutPage;
import com.pages.HomePage;
import com.utils.HelperClass;
public class ChcekOutActions {
CheckOutPage cp=null;
public ChcekOutActions() {
	this.cp=new CheckOutPage();
	PageFactory.initElements(HelperClass.getDriver(), cp);
}
public void chcekout(String coun) {
	Select s=new Select(cp.cId);
	s.selectByVisibleText(coun);
	cp.terms.click();
}
public String verify(){
	String tit=HelperClass.getDriver().getTitle();
	return tit;
}
public void click() {
	cp.ckout.click();
}
}
