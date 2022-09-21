package Mobile_World;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class home_page{
    @Test
    public void home_page01() throws InterruptedException
    
{
        System.setProperty("webdriver.chrome.driver","C:/Users/mahalakshmi.tm/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");   
        Thread.sleep(1000);
        driver.quit();
        
}
    @Test
    public void home_page02() throws InterruptedException {
        WebDriver driver = new ChromeDriver();        
         driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
         
         Thread.sleep(1000);
         driver.quit();
        
    }
    
    
    @Test
    public void home_page03() throws InterruptedException {
        WebDriver driver = new ChromeDriver();        
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
     driver.findElement(By.xpath("//a[@class='dropdown-item\']")).click();
   
     Thread.sleep(1000);
     driver.quit();
        
    }
    @Test
    public void home_page04() throws InterruptedException {
        WebDriver driver = new ChromeDriver();        
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
     driver.findElement(By.xpath("//a[@class='dropdown-item\']")).click();
     driver.findElement(By.xpath("//section[@id='home']")).click();
     Thread.sleep(1000);
     driver.quit();
   }
    @Test
    public void home_page05() throws InterruptedException {
       WebDriver driver = new ChromeDriver();        
        driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle\']")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
         Thread.sleep(1000);
         driver.quit();    
   }
   @Test
   public void home_page06() throws InterruptedException {
      WebDriver driver = new ChromeDriver();        
    driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
        Thread.sleep(1000);
     driver.quit();
      
   }
   @Test
   public void home_page07() throws InterruptedException {
     WebDriver driver = new ChromeDriver();        
     driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
      
       driver.findElement(By.cssSelector(".dropdown-item[href='order.html']")).click();
    Thread.sleep(1000);
    driver.quit();
  }
    @Test
    public void home_page08() throws InterruptedException {
       WebDriver driver = new ChromeDriver();        
        driver.get("https://mobileworld.banyanpro.com/");
          driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
         driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Contact Us']")).click();
         Thread.sleep(1000);
         driver.quit();
    }  
}
