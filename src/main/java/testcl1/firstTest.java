package testcl1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firstTest {

	@Test
	public static void lauchbrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		System.out.println("browser launched");
	}
}
