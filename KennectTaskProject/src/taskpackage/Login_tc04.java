package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_tc04 {

	public static void main(String[] args) {
		
		//To test or verify if user gets login when email and password are invalid
		
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.findElement(By.name("email")).sendKeys("test@kennect.iodemo");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234444");
		driver.findElement(By.className("MuiButtonBase-root")).click();
	}

}
