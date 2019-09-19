package org.test1111111;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelGetDataSample extends ExcelGetData{
	public static void main(String[] args) throws Throwable {
	 launchBrowser();
	 load("https://www.snapdeal.com");
	 String windowHandle = driver.getWindowHandle();
	 System.out.println(windowHandle);
	 Thread.sleep(2000);
	 WebElement search = driver.findElement(By.id("inputValEnter"));
		fill(search,getData(0,0));
		 Thread.sleep(2000);

		WebElement serbtn= driver.findElement(By.className("searchTextSpan"));
		btnclick(serbtn);
		 Thread.sleep(2000);

		WebElement shoe = driver.findElement(By.xpath("//p[text()='Unistar Canvas Sneakers Black Casual Shoes']"));
		btnclick(shoe);
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		for (String eachwindow : windowHandles) {
			if(!windowHandle.equals(eachwindow)) {
				driver.switchTo().window(eachwindow);
			}
		}
     Thread.sleep(2000); 
     WebElement addtocart = driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
     Thread.sleep(2000);
     btnclick(addtocart);
     
     WebElement view = driver.findElement(By.xpath("//div[text()='View Cart']"));
     btnclick(view);
     Thread.sleep(2000);
     WebElement quy = driver.findElement(By.xpath("//div[@id='CS1']"));
     btnclick(quy);
     Thread.sleep(2000);
     WebElement quy1 = driver.findElement(By.xpath("(//li[@class='undefined'])[1]"));
     
     btnclick(quy1);
     Thread.sleep(2000);
 WebElement proceed = driver.findElement(By.xpath("//input[@type='button']"));
     
     btnclick(proceed);
     Thread.sleep(2000);
 WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
 fill(user,getData(1,0));
     
     Thread.sleep(2000);
     
     WebElement con = driver.findElement(By.id("login-continue"));
     
     btnclick(con);
     Thread.sleep(2000);
     WebElement pw = driver.findElement(By.name("password"));
     fill(pw,getData(2,0));
         
         Thread.sleep(2000);
         WebElement login = driver.findElement(By.id("login-done"));
         
         btnclick(login);
         Thread.sleep(2000);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

}
}