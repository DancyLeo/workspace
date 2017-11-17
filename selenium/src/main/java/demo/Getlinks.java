package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Getlinks {
	

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/leo/app/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baiwang.com");
		List<WebElement> elementList=driver.findElements(By.tagName("a"));
		List<Links> linkList=new ArrayList<Links>();
		try {
		for(WebElement e:elementList) {
			Links ls=new Links();
			if(e.getAttribute("href")!=null) {
			ls.setLink(e.getAttribute("href"));
			ls.setLinktxt(e.getText());
			linkList.add(ls);
			}
		}
		
		Collections.sort(linkList,new linksComparator());
		for(Links ls:linkList) {
			System.out.println(ls.toString());
		}
		Thread.sleep(2000);
		}catch(Exception e) {
			System.out.print(e);
		}finally {
			driver.close();	
		}
	}
}

 class linksComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		//System.out.println("the same class");
		Links l1=(Links)o1;
		Links l2=(Links)o2;
		return l1.getLink().compareTo(l2.getLink());
	}
}
