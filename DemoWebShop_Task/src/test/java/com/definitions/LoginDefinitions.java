package com.definitions;
import org.testng.Assert;
import com.actions.HomePageActions;
import com.actions.LoginActions;
import com.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginDefinitions {
	HelperClass hp=new HelperClass();
	LoginActions la=new LoginActions();
	HomePageActions ha=new HomePageActions();
	@Given("the user is on DemoWebShop Login page {string}")
	public void launch(String string) {
	    hp.openPage(string);
	}
	@When("the user enters valid {string} and {string}")
	public void login(String string, String string2) {
	   la.setUsername(string);
	   la.setPassword(string2);
	   la.click();
	}
	@Then("the user should see the message {string}")
	public void chcekLogin(String string){
		if(string.equals("Welcome to the new Tricentis store!")) {
			String actual=ha.getHomeText();
			Assert.assertEquals(actual,string);
		}
		else {
			String actual=ha.getHomeText();
			Assert.assertEquals(actual,string);
		}
	}
}
