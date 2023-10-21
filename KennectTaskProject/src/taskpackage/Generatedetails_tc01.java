package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generatedetails_tc01 {
//To test or verify if user is able to generate details when name, email, phone no are valid
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\SOFT\\seleniump\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://gor-pathology.web.app/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");
		driver.findElement(By.className("MuiButtonBase-root")).click();
		
		driver.findElement(By.cssSelector("body.pace-done:nth-child(2) div.jss5 nav.jss6.jss10 div.jss24 div.MuiDrawer-root.MuiDrawer-docked div.MuiPaper-root.MuiDrawer-paper.jss8.jss11.MuiDrawer-paperAnchorLeft.MuiDrawer-paperAnchorDockedLeft.MuiPaper-elevation0 ul.MuiList-root.MuiList-padding a:nth-child(2) div.MuiButtonBase-root.MuiListItem-root.jss38.jss39.MuiListItem-gutters.MuiListItem-button.Mui-selected div.MuiListItemText-root > span.MuiTypography-root.MuiListItemText-primary.MuiTypography-body1.MuiTypography-displayBlock")).click();
		driver.findElement(By.xpath("//div[@class='MuiListItemText-root']")).click();
		driver.findElement(By.className("MuiButtonBase-root")).click();
		
		driver.findElement(By.name("name")).sendKeys("demo namee");
		driver.findElement(By.name("email")).sendKeys("democontact@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9988009988");
		driver.findElement(By.className("MuiButtonBase-root ")).click();
		
		driver.findElement(By.name("height")).sendKeys("160");
		driver.findElement(By.name("weight")).sendKeys("45");
		driver.findElement(By.className("jss187 ")).sendKeys("Male");
		driver.findElement(By.name("age")).sendKeys("50");
		driver.findElement(By.name("systolic")).sendKeys("90");
		driver.findElement(By.name("diastolic")).sendKeys("90");
		
		driver.findElement(By.className("")).click();
		driver.findElement(By.id("patient-test")).sendKeys("AFP(Alpha Feto Proteins) - 350");
		driver.findElement(By.className("MuiList-root MuiMenu-list MuiList-padding")).sendKeys("5%");
		driver.findElement(By.className("patient-tests-labs")).sendKeys("Test Lab - AFP(Alpha Feto Proteins) - 350");
		driver.findElement(By.className("doctor_name")).sendKeys("Dr.roheet rathod ");
		driver.findElement(By.className("MuiList-root")).sendKeys("10% ");
		driver.findElement(By.className("MuiInputBase-root")).sendKeys("test equipment ");
		driver.findElement(By.className("MuiInputBase-root")).sendKeys("2");
		driver.findElement(By.name("MuiButton-label jss179")).click();
		
		
	
	}

}
