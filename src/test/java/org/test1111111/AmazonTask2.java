package org.test1111111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonTask2  extends AmazonBase{
	
	public static void main(String[] args) throws Throwable {
		launchBrowser();
		
	load("https://www.amazon.com");
	 screen("E:\\screenshot\\.amazon1.png");
	 Thread.sleep(2000);
	 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		fill(search,getData(0,0));
		screen("E:\\screenshot\\.amazon2.png");
		 Thread.sleep(2000);
	WebElement search1 = driver.findElement(By.className("nav-input"));
	
		btnclick(search1);
		List<WebElement> text = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement x : text) {
			System.out.println(x.getText());
			screen("E:\\screenshot\\.amazon2.png");
			
		}
		text.get(2).click();
}


}
