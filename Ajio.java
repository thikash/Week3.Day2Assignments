package assignmentWeek3.day2;

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
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver ji = new ChromeDriver();
		// get url
		ji.get("https://www.ajio.com/");
		// maximize the screen
		ji.manage().window().maximize();
		// add implicitywait
		ji.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// search Bags
		ji.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);

		// click Men
		ji.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		// click Fashion bags
		ji.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		// Print the count of the items Found
		 String totalItems=ji.findElement(By.className("length")).getText();
	
		System.out.println("Tottal no of Items:"+totalItems);
		// Get the list of brand of the products displayed in the page and print the
		System.out.println("*********List Of Brands*********");
		List<WebElement> bagbrandlist = ji.findElements(By.className("brand"));
		System.out.println("Total no of Brands:" + bagbrandlist.size());
		for (WebElement webElement : bagbrandlist) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
//Get the list of name of the bag 
		List<WebElement> bagNameList = ji.findElements(By.className("name"));
		System.out.println("Total no of BagNameList:"+bagNameList.size());
		System.out.println("*******Name of the Bags*******");
		for (WebElement webElement : bagNameList) {
			String text1 = webElement.getText();
			System.out.println(text1);

		}
	}
}
