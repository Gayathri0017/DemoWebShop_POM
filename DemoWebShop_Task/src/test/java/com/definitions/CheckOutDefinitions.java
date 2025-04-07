package com.definitions;

import java.util.List;

import org.testng.Assert;

import com.actions.ChcekOutActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutDefinitions {
	ChcekOutActions ca=new ChcekOutActions();
	@When("the userr enters the checkout Details")
	public void checkout_details(io.cucumber.datatable.DataTable dataTable) {
	    List<String> con=dataTable.asList();
	    String country=con.get(1);
	    ca.chcekout(country);
	}
	@When("Cliks the check out button")
	public void chcekout() {
	    ca.click();
	}
	@Then("the user should go to the check out page")
	public void verify_checkout() {
	    String ex="Demo Web Shop. Checkout";
	    String act=ca.verify();
	    Assert.assertEquals(ex,act);
	}
}
