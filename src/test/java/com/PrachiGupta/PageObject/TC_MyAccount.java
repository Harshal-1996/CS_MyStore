package com.PrachiGupta.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_MyAccount {

		WebDriver ldriver;			
		public TC_MyAccount(WebDriver rdriver) {
			 ldriver=rdriver;
			 PageFactory.initElements(rdriver, this);
		}
				// identify WebElements
		 @FindBy(name="username") 
		 WebElement id;

		 @FindBy(name="password")
		 WebElement pass;
		 
		 @FindBy(linkText="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
		 WebElement login;
		// identify action on webelement 
		public void clickOnid() {
			id.sendKeys("Admin");
		}
		public void clickpass() {
			pass.sendKeys("admin123");
		}
		public void submit() {
			login.click();
		}

		


}
