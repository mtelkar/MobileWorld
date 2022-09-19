
package Mobile_World;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Signup{

	WebDriver driver;
@Test
    public void register() {
        System.setProperty("webdriver.chrome.driver","C:/Users/mahalakshmi.tm/Downloads/chromedriver_win32/chromedriver.exe");
         driver = new ChromeDriver();
        
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Mahalakshmi");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("T M");
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("maha123@gmail.com");
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Maha@123");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("26");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("1998");
        driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("876543234");
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Positive Vibes");
        driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
        driver.switchTo().alert().accept();
    }
}