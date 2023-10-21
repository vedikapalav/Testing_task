package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_tc07 {

	
	// To test or verify if user gets login when email and password both are blank
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.className("MuiButtonBase-root")).click();

	}

}
