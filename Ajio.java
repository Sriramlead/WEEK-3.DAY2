package week3.day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Footwear" , Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Boys')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Sandals')]")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Number of the items found:" + text);
		//**get the list of brands
		System.out.println("*****list of brands****");
		List<WebElement> brand=driver.findElements(By.xpath("//div[@class='brand']")); ////input[@name='searchVal']  ,,,//div[@class='length']
		WebElement name;
		Set<String>Sandals=new LinkedHashSet<String>();
		for(int i=0;i<brand.size();i++)
		{
			name=brand.get(i);
			String str=name.getText();
			Sandals.add(str);
		}
		for(String BrandName:Sandals)
		{
			System.out.println("BrandName:" + BrandName);
		}
		System.out.println("*******list of SandalsNames****");
		List<WebElement> bagName=driver.findElements(By.xpath("//div[@class='name']"));
		WebElement name1;
		Set<String> Sandals1=new LinkedHashSet<String>();
		for(int i=0;i<bagName.size();i++)
		{
			name1=bagName.get(i);
			String str1=name1.getText();
			Sandals1.add(str1);
		}
		for(String SandalsName:Sandals)
		{
			System.out.println("SandalsName:" + Sandals);
		} 
	
	
	
	
	
	
}
	
	
}
