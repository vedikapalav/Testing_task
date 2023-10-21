package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwithgoogle02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To test or verify if user gets login with google account when entered invalid email
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.findElement(By.className("MuiButtonBase-root")).click();


	}

}
