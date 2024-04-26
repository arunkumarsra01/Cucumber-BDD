package stepDefintions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_POM;

public class loginpage_StepDef extends Login_POM {

	@Given("User is in login page")
	public void user_is_in_login_page() {
		Login_POM.setup();
		Login_POM.loginLink();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		Login_POM.credentials(string, string2);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		Login_POM.loginbtn();
	}

	@Then("User should able to see the product details")
	public void user_should_able_to_see_the_product_details() {
		Assert.assertEquals(true, Login_POM.productDetails());
		Login_POM.tearDown();
	}

	@When("User enters the username as {string} and password as {string}")
	public void user_enters_the_username_as_and_password_as(String string, String string2) {
		Login_POM.credentials(string, string2);
	}


	@Then("User should see the error message")
	public void user_should_see_the_error_message() {
		Assert.assertEquals(true, Login_POM.validation());
		Login_POM.tearDown();
	}

}
