package stepDefintions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Cart_POM;

public class addTocart_StepDef extends Cart_POM {

	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
		Cart_POM.setup();
		Cart_POM.loginLink();
	}

	@When("User enters the  username as {string} and password as {string}")
	public void user_enters_the_username_as_and_password_as(String string, String string2) {
		Cart_POM.credentials(string, string2);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_login_button() {
		Cart_POM.loginbtn();
	}

	@When("User clicks on the books section")
	public void user_clicks_on_the_books_section() {
		Cart_POM.bookSection();
	}

	@When("User add the selected product to the cart")
	public void user_add_the_selected_product_to_the_cart() {
		Cart_POM.addToCart();
	}

	@Then("User should verify the confirmation message")
	public void user_should_verify_the_confirmation_message() {
		Assert.assertEquals(true, Cart_POM.shoppingCart());
		Cart_POM.tearDown();

	}

}
