package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwithgoogle_01 {

	//To test or verify if user gets login with google account when entered valid email
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.findElement(By.className("MuiButtonBase-root")).click();

	}

}
