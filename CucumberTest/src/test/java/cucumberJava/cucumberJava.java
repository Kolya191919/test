package cucumberJava; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 


public class cucumberJava { 
   WebDriver driver = null; 
	

@Given("^User on login page$")
   public void user_on_login_page() { 
	   System.setProperty("webdriver.chrome.driver", "/Users/msb19/Downloads/chromedriver");
	   driver = new ChromeDriver(); 
	   driver.navigate().to("https://upsidedown.getjobfit.com/");
	   
   } 
	
/*   @When("^I open Getjobfit website$") 
    public void goToGetjobfit() { 
   driver.navigate().to("https://upsidedown.getjobfit.com/"); 
     } 
	   
  
   
   @Then("^Login button should exits$") 
   
  public void loginButton() { 
    if(driver.findElement(By.xpath("//a[contains(text(),'Login')]")).isEnabled()) { 
       System.out.println("Test 1 Pass"); 
    } else { 
        System.out.println("Test 1 Fail"); 
    } 
   
  

    @Given("^User on landing page$")
    public void user_on_landing_page(){
      // user navigate to landing page  
    	driver.navigate().to("https://upsidedown.getjobfit.com/"); 
    	
    } */


    @When("^User login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_username_something_and_password_something(String strArg1, String strArg2) {
     //click on Login Button
    	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        //user insert username in username field
    	driver.findElement(By.cssSelector("div.ui.fluid.container.sc-eAudoH.kiEWMq:nth-child(2) div.login-form div.ui.stackable.grid div.equal.width.row:nth-child(1) div.six.wide.column:nth-child(2) form.ui.large.warning.form:nth-child(2) div.required.field:nth-child(1) div.ui.input:nth-child(2) > input:nth-child(1)")).click();
    	driver.findElement(By.cssSelector("div.ui.fluid.container.sc-eAudoH.kiEWMq:nth-child(2) div.login-form div.ui.stackable.grid div.equal.width.row:nth-child(1) div.six.wide.column:nth-child(2) form.ui.large.warning.form:nth-child(2) div.required.field:nth-child(1) div.ui.input:nth-child(2) > input:nth-child(1)")).sendKeys(strArg1);
    	//user insert password in password field
    	driver.findElement(By.xpath("//input[@placeholder='Password (at least 6 characters)']")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Password (at least 6 characters)']")).sendKeys(strArg2);
    	//click on login button
    	driver.findElement(By.xpath("//button[@class='ui large fluid button sc-fCPvlr dyXCca']")).click();
    }

    @Then("^Dashboard is shown$")
    public void dashboard_is_shown()  {
        // find few elements that always displayed on dashboard
    	if (driver.findElement(By.cssSelector("div.ui.grid div.computer.only.row div.column div.ui.large.borderless.top.fixed.menu div.menu > a.active.item:nth-child(1)")).isEnabled()) {
    		System.out.println("Test 1 Pass"); 
        } else { 
            System.out.println("Test 1 Fail"); 
        
    	}
      
    
 
      driver.close(); 
   } 
}







