package pagelayer;

import org.openqa.selenium.By;

import baselayer.Baseclass;

public class Ragisterpage extends Baseclass {

	   public void contactInformation(String fname,String lname,String mob, String email) {
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.name("phone")).sendKeys(mob);
	   driver.findElement(By.name("userName")).sendKeys(email);
	   
	   }
	   
	   public void mailingInformation(String add,String city,String state, String pcode,String country) {
		   driver.findElement(By.name("address1")).sendKeys(add);
		   driver.findElement(By.name("city")).sendKeys(city);
		   driver.findElement(By.name("state")).sendKeys(state);
		   driver.findElement(By.name("postalcode")).sendKeys(pcode);
		   driver.findElement(By.name("country")).sendKeys(country);
	   
}

	
		
	}
