package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM extends BaseClass {

	@FindBy(css = ".ico-login")
	static WebElement loginlink;

	@FindBy(css = "#Email")
	static WebElement userName;

	@FindBy(css = "#Password")
	static WebElement password;

	@FindBy(css = ".button-1.login-button")
	static WebElement loginbtn;
	
	@FindBy(css=".block.block-category-navigation")
	static WebElement products;
	
	@FindBy(css=".validation-summary-errors span")
	static WebElement validation;

	public Login_POM() {
		super();
		PageFactory.initElements(BaseClass.driver, this);
	}

	public static void loginLink() {
		loginlink.click();
	}

	public static void credentials(String username, String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
	}

	public static void loginbtn() {
		loginbtn.click();
	}
	 
	public static Boolean productDetails() {
		return products.isDisplayed();
	}
	
	public static Boolean validation() {
		return validation.isDisplayed();
	}
}
