package testlayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baselayer.Baseclass;
@Test(groups="HomePage",dependsOnGroups= {"LoginPage"})
public class HomePage extends Baseclass {
	public void validateHomePageTitle() {
		String a=driver.getTitle();
		Assert.assertEquals(true, a.contains("CRM"));
	}
	public void validateHomePageUrl() {
		String b=driver.getCurrentUrl();
		Assert.assertEquals(true, b.contains("cogmento"));
	}
	public void validateHomePageLogo() {
		boolean a = driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();

		Assert.assertEquals(true, a);
	}
	

}
