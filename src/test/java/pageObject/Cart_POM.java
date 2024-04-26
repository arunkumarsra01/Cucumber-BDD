package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_POM extends BaseClass {

	@FindBy(css = ".ico-login")
	static WebElement loginlink;

	@FindBy(css = "#Email")
	static WebElement userName;

	@FindBy(css = "#Password")
	static WebElement password;

	@FindBy(css = ".button-1.login-button")
	static WebElement loginbtn;

	@FindBy(css = ".header-menu>.top-menu> li:nth-of-type(1) a")
	static WebElement booksection;

	@FindBy(xpath = "(//input[@type='button'])[3]")
	static WebElement addtocart;

	@FindBy(xpath = "(//a[@href='/cart'])[1]")
	static WebElement shoppingcart;

	public Cart_POM() {
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

	public static void bookSection() {
		booksection.click();
	}

	public static void addToCart() {
		addtocart.click();
	}

	public static Boolean shoppingCart() {
		return shoppingcart.isDisplayed();
	}

}