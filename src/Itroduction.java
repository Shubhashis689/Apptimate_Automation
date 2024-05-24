import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itroduction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsr\\Downloads\\ChromeDriver115_Win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev.redesk.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		//Alert alert=driver.switchTo().alert();
		//alert.dismiss();
		driver.findElement(By.xpath("//button[@class='btn main-color-bg main-bg-text-color']//parent::div[@class='MuiBox-root css-130f8nx']")).click();
		
	}

}
