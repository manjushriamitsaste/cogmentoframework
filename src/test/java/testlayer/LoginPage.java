package testlayer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselayer.Baseclass;
@Test(groups= {"loginPage"})
public class LoginPage extends Baseclass {

	@BeforeTest
	public void setup() {
		Baseclass.inilization();
	}
	@Test
	public void loginFunctionality() {
		driver.findElement(By.name("email")).sendKeys("manjushri25@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='login']")).click();
	}
	public void teardown() {
		driver.quit();
	}
}
