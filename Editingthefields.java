package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editingthefields {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("Email");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Appendbaba");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.TAB);
		String Getname = driver.findElement(By.name("username")).getText();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		boolean enabled = driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]//following::input[1]")).isEnabled();
		if(enabled==true){
			System.out.println("The field is working");
		}
		else {
			System.out.println("The field is not working");
		}
	}

}
