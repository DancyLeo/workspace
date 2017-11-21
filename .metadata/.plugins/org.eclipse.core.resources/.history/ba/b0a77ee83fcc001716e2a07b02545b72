package webtest.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinks{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/leo/app/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baiwang.com");
		List<WebElement> elementList=driver.findElements(By.tagName("a"));
		List<Links> linksList=new ArrayList<Links>();
		int i=1;
		for(WebElement o:elementList) {
			Links ls=new Links();
			if(o.getAttribute("href")!=null) {
				ls.setnum(i++);
				ls.setLink(o.getAttribute("href"));
				ls.setLinktxt(o.getText());
				linksList.add(ls);
			}	
		}
		Collections.sort(linksList,new linkComparator());
		
		for(Links o:linksList) {
			System.out.println(o.toString());
		}
		try {
		Thread.sleep(2000);
		}catch(Exception e) {
			
		}finally {
			driver.close();	
		}
	}
}
