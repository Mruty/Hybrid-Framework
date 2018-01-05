package in.swagen.framework.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import in.swagen.framework.pom.OptLoginPage;
import in.swagen.framework.util.Helper;

public class ValidOptLogin1 extends BaseTest{
	
	@Test
	public void testValidOptLogin1() throws InterruptedException{
		log.info("ttttttttttttt");
		OptLoginPage loginpage=new OptLoginPage(driver);
		Helper helper=new Helper();
		helper.enterText(driver, loginpage.getUsername(),userName);
		helper.enterText(driver, loginpage.getPassword(),passWord);
		Helper.customWait(5);
		helper.clickOnElement(driver, loginpage.getLoginBtn());
		helper.clickOnElement(driver, driver.findElement(By.xpath("//a[.='Create Contact']")));
		Helper.customWait(5);
		helper.selectDropDown(driver,driver.findElement(By.xpath("//select[@name='salutation']")), "Prof.");
		Helper.customWait(5);

	}
}
