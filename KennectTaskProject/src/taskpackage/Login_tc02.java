package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_tc02 {

	// To test or verify if user gets login when email is valid and password is invalid
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234444");
		driver.findElement(By.className("MuiButtonBase-root")).click();
	}

}
