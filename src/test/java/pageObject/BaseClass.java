package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	static Properties property;

	public BaseClass() {
		property = new Properties();
		try {
			FileInputStream file = new FileInputStream("E:\\BDD\\src\\main\\resources\\config.properties");
			property.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

	public static void setup() {
		driver.get(property.getProperty("base_Url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	public static void tearDown() {
		driver.quit();
	}
}
