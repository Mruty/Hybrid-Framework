package in.swagen.framework.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OptLoginPage {
	private WebDriver driver;
	@FindBy(id="text1")
	private WebElement username;
	@FindBy(id="password1")
	private WebElement password;
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginBtn;
	public OptLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername(){
		return username;
	}
	public WebElement getPassword(){
		return password;
	}
	public WebElement getLoginBtn(){
		return loginBtn;
	}
}
