package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import baseFunctionalities.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.NewToursLocators;

public class NewToursLogin extends BaseClass {
	
    @Before
    public void callingPreConditions() throws Throwable {
    	preConditions();    	
    }
    
    @After
    public void callingAfterConditions() throws Throwable {
    	afterConditions();
    }    
	
	@Given("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		WebElement ele = driver.findElement(NewToursLocators.userName);
		ele.clear();
		ele.sendKeys(arg1);

	}
    
	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg2) throws Throwable {
		WebElement ele = driver.findElement(NewToursLocators.password);
		ele.clear();
		ele.sendKeys(arg2);
	}
    
	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(NewToursLocators.login).click();

	}
    
	@Then("^You should see the SIGN-OFF text$")
	public void you_should_see_the_logo() throws Throwable {

		WebElement expectedValue = driver.findElement(By.linkText("SIGN-OFF"));
		WebElement actualValue = driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]"));

		Assert.assertEquals(expectedValue, actualValue);

		System.out.println("Login successful");
	}
}
