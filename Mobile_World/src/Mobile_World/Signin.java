package Mobile_World;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Signin {
    @Test
    public void signin() throws InterruptedException



   {
        System.setProperty("webdriver.chrome.driver","C:/Users/mahalakshmi.tm/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        String name =  "maha123@gmail.com";
        String password = "Maha@123";
        
        
        landingpage.goTo();
        landingpage.character3(name, password);
       
        Thread.sleep(2000);
        driver.close();
       
        
        
    }
    
    @Test
    public void signin2() throws InterruptedException
    {
        String name =  "Maha@123";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.character20(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin3() throws InterruptedException
    {
        String name =  "tm";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
        
    }
    @Test
    public void signin4() throws InterruptedException
    {
        String name =  "abcdefghijklmnopqurst";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin5() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.validemail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin6() throws InterruptedException
    {
        String name =  "Ma@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.unregisteremail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin7() throws InterruptedException
    {
        String name =  "Maha";
        String password = "Maha@123";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.validdetails(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void signin8() throws InterruptedException
    {
        String name =  "Maha";
        String password = "Mah";
        WebDriver driver = new ChromeDriver();
        landingpage landingpage = new landingpage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
}
