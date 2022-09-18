package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver = driver;
		
	}
	
	// webelement 
	//By USERNAME_LOCATOR = By.xpath("//*[@id=\"username\"]");
	//WebElement USERNAME_EMEMENT_1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	
	// we don't used like this in POM we located them in a different way.
	
   @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")WebElement USERNAME_ELEMENT;
   @FindBy(how = How.XPATH, using ="//*[@id=\"password\"]")WebElement PASSWORD_ELEMENT;
   @FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")WebElement SINGIN_BUTTON_ELEMENT;
   
   //Intractable methods
   public void insertUserName(String username) {
	   USERNAME_ELEMENT.sendKeys(username);
	    }
   
   public void insertPassword(String password) {
	   PASSWORD_ELEMENT.sendKeys(password);
	   }
	   
	   public void clickSigninButton() {
		   SINGIN_BUTTON_ELEMENT.click();
	   }
	   
	   public void loginIn (String userName, String password) {
		   USERNAME_ELEMENT.sendKeys(userName);
		   PASSWORD_ELEMENT.sendKeys(password);
		   SINGIN_BUTTON_ELEMENT.click();
	   }
   
}
