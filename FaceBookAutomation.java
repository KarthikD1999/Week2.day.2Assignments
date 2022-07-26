package seleniumbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		//driver.findElement(By.id("u_0_0_tv")).click();
		//driver.findElement(By.xpath("//input[@name='firstname']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hfdh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dsvfdsds");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vdvdsdsf@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("vdvdsdsf@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123321Asdsf@gmail.com");
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		Select daysel = new Select(day);
		daysel.selectByVisibleText("11");
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.id("month"));
		Select monthsel = new Select(month);
		monthsel.selectByVisibleText("Jan");
		WebElement year = driver.findElement(By.id("year"));
		Select yearsel = new Select(year);
		yearsel.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
