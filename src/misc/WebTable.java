package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int noofRows = rows.size();
	//	List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th"));
	//	int noofColumns = column.size();
		System.out.println("NoofRows "+noofRows);
		//System.out.println("NoofColumns "+noofColumns);
		
//		Iterator<WebElement> it = column.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next().getText()+"        ");
//		}
		System.out.println();
		List<WebElement> alldata = driver.findElements(By.xpath("//table//tr"));
		Iterator<WebElement> it2 = alldata.iterator();
		while(it2.hasNext())
		{
			
			System.out.println(it2.next().getText()+" ");
		}
		
	}

}
