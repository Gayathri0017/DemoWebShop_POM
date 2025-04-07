package com.definitions;
import com.actions.SearchActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class SearchDefinitions {
	SearchActions sa=new SearchActions();
	@When("search the product in search bar")
	public void search_the_product() {
	    sa.searchh();
	}
	@When("user apply the filter options and clicks saves")
	public void filter() {
	   sa.filter();
	}
	@When("clicks the Add to cart button")
	public void clicks_the_add_to_cart_button() {
	    sa.addToCart();
	}
	@Then("Go to the shopping cart")
	public void shopping_cart() {
	   sa.cart();
	}
	@Then("verify the product added to the cart")
	public void verify_the_product_added_to_the_cart() {
	    String ex="Smartphone";
	    String ac=sa.proText();
	    Assert.assertEquals(ex,ac);
	}
}
