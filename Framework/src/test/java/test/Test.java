package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import in.swagen.framework.util.ReadData;
import in.swagen.framework.util.Helper;

public class Test {
	public static void main(String[] args) {
//		ChromeOptions c=new ChromeOptions();
//		c.addArguments("start-maximized");
//		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mrutyunjay/Desktop/Alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Helper l=new Helper();
		Helper.customWait(6);
		l.switchToAlert(driver).dismiss();
		driver.close();
	}
}
