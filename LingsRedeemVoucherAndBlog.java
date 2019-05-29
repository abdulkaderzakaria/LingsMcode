package com.lings;

import org.openqa.selenium.By;

import com.lingsbaseclass.LingsBaseClass;

public class LingsRedeemVoucherAndBlog extends LingsBaseClass{
	public static void redeemVoucherandblog() throws Throwable {
		driver = getBrowser("chrome");
		getUrl("https://staging-lings.cs105.force.com");
		//Blog window
		clickOnWebelement(driver.findElement(By.xpath("//a[@href='https://blog.lings.ch']")));		
		switchToMultipleWindow(1);		
		switchToMultipleWindow(0);
		//Redeem Voucher		
		clickOnWebelement(driver.findElement(By.xpath("//a[@href='#/de/gutschein-einlosen']")));
		//Login		
		String username = excel2(1, 1);		
	    inputValuestoWebElement(driver.findElement(By.id("username")),username);	  
	    String password = excel2(1, 2);
		inputValuestoWebElement(driver.findElement(By.id("password")),password );
		clickOnWebelement(driver.findElement(By.xpath("//input[@class='button']")));
		String voucher = excel2(1, 3);
		inputValuestoWebElement(driver.findElement(By.id("name")),voucher);
		clickOnWebelement(driver.findElement(By.id("submit")));
		clickOnWebelement(driver.findElement(By.xpath("(//img[@alt='Lings Logo'])[1]")));
		clickOnWebelement(driver.findElement(By.xpath("//img[@alt='Logout']")));
		driver.quit();

}
	public static void main(String[] args) throws Throwable {
		redeemVoucherandblog();
	}
}
