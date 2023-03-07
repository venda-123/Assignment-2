package week9.day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderingMobile {
public static void main (String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev140572.service-now.com\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().frame(0);
    driver.findElement(By.id("user_name")).sendKeys("admin");
    driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
    driver.findElement(By.id("sysverb_login")).click();
    //driver.switchTo().defaultContent();
	driver.findElement(By.id("filter")).sendKeys("Service Catalog");
   driver.findElement(By.xpath("(//div[text()='Service Catalog'])[1]")).click();
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//h2[contains(text(),'Mobile')]")).click();
    driver.switchTo().defaultContent();
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("(//a[@class='service_catalog'])[1]")).click();
    
   WebElement findElement = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
   Select drop=new Select(findElement);
	drop.selectByVisibleText("Gold");
	WebElement findElement2 = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
	Select dropDown=new Select(findElement2);
	dropDown.selectByVisibleText("128");
	driver.findElement(By.id("oi_order_now_button")).click();
	
	
}
}
