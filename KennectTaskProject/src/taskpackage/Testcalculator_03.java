package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcalculator_03 {

	public static void main(String[] args) {
		// To test or verify if user gets accurate cost after not selecting tests for patients and selecting discounts
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.manage().window().maximize();
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		
		Js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");
		driver.findElement(By.className("MuiButtonBase-root")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/a[2]/div[1]/div[2]/span[1]")).click();
		driver.findElement(By.className("MuiSelect-root")).click();
		
	}

}
