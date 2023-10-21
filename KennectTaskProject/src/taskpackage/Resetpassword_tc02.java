package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resetpassword_tc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// To test or verify if user reset password when invalid email is entered
		
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.manage().window().maximize();
		driver.findElement(By.className("MuiButtonBase-root"));
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/button[1]"));
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/button[1]")).sendKeys("test@kennect.iodemo");
		
	}

}
