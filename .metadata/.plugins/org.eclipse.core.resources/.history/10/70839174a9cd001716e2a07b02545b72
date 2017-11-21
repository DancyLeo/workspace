package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/leo/app/driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		try {
		driver.get("http://gh.wenchain.com/sys/clienteles");
		WebElement table=driver.findElement(By.tagName("table"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++) {
			List<WebElement> colum=row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<colum.size();j++) {
				if(colum.get(j).getText().equals("建筑业")) {
					System.out.print("建筑业位于"+ (i+1) +"行"+(j+1)+"列");
				}
			}
			System.out.println();
		}
		
		
		/*
		for(WebElement e:colum)
			System.out.print(e.getText() + " ,");
		/*
		for(WebElement e:trs)
			System.out.print(e.getText() + " ");
		
		
		WebElement[] tra=(WebElement[]) trs.toArray();
		WebElement[] tda=(WebElement[])tds.toArray();
		/*
		for(int i=0;i<tra.length;i++) {
			System.out.println(tra[i].getText());
			/*
			for(int j=0;j<tda.length;j++) {
				System.out.println(tda[j].getText());
				System.out.println();
			}*/
			//System.out.println();

		
		}catch(Exception e) {
			System.out.print(e);
		}finally {
			driver.close();
		}
	}
}
