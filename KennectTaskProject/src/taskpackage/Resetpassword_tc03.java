package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resetpassword_tc03 {

	public static void main(String[] args) {
		// To test or verify if user reset passsword when email id is blank
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.manage().window().maximize();
		driver.findElement(By.className("MuiButtonBase-root"));
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/button[1]")).sendKeys("");
	

	}

}
