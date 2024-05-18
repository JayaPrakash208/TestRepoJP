package testcl1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass2 {

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		System.out.println("browser launched");	}

}
