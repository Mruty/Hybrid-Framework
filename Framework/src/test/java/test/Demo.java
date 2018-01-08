package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import in.swagen.framework.util.SetUpDrivers;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		SetUpDrivers d=new SetUpDrivers();
		WebDriver driver = d.launchChromeDriver("file:///C:/Users/Mrutyunjay/Desktop/check.html");
		List<WebElement> elements = driver.findElements(By.xpath("//td[last()]"));
		System.out.println(elements.size());
		for(WebElement ele:elements){
			ele.click();
		}
		Thread.sleep(2000);
		driver.close();
	}
}
