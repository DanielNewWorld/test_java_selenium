package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Selentroduction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Daniel\\GitHub\\java\\test_java_selenium\\test_java_selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//System.setProperty("webdriver.edge.driver", "D:\\Selenium\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//----

		driver.get("https://ftd.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());

//1. Verify the user can submit SWAG with a valid zip code on the Home page
		driver.findElement(By.name("zipCode")).sendKeys("90006");
		driver.findElement(By.name("date")).sendKeys("11/16/2022");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
//		driver.findElement(By.name("date")).sendKeys("11/16/2022");

		driver.findElement(By.className("button_btn__RSDqV")).click();


		//---
		//driver.findElement(By.className("button_btn-swag-light__g1SUb")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.findElement(By.linkText("Forgout your password")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys('Daniel');

		//driver.close(); //��������� ������� ����
		//driver.quit(); // ��������� ��� ���� � �������
	}
}