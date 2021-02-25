package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	
	@FindBy(name="user_login")
	WebElement editUsername;
	
	@FindBy(name="user_pwd")
	WebElement editPwd;
//	
//	@FindBy(className="rememberMe")
//	WebElement chkBox;
	
	@FindBy(name="btn_login")
	WebElement btnPwd;
	
	
	public Loginpage(WebDriver testdriver) 
	{
		this.driver=testdriver;
	}
	
	public void Login(String UserName,String password) {
		
		//WebElement lnkLogin=driver.findElement(By.linkText("Log in"));
		
		lnkLogin.click();
		
        //WebElement editUserName=driver.findElement(By.name("user_login"));
        editUsername.sendKeys(UserName);
        
        //WebElement editPwd=driver.findElement(By.name("user_pwd"));
        editPwd.sendKeys(password);
        
      // WebElement btnPwd=driver.findElement(By.name("btn_login"));
        btnPwd.click();
	}
	
	
	
	

}
