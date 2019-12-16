import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selectors {

    WebDriver driver;
    @BeforeMethod
    public void  setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void NginxElementsTest() throws InterruptedException {
     driver.get("https://www.nginx.com/");

        driver.findElement(By.cssSelector("#menu-item-57695")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-57695']")).click();

        /*driver.navigate().back();
        driver.findElement(By.cssSelector("#menu-item-53220")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-53220']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("li#menu-item-53220 [title='NGINX Plus']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-53220']//a[@title='NGINX Plus']")).click();*/
       // driver.navigate().back();
        driver.findElement(By.cssSelector("nav#nx-site-navigation div.search-form-wrapper")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//nav[@id='nx-site-navigation']//div[@class='search-form-wrapper']")).click();
       // driver.navigate().back();
        /*driver.findElement(By.cssSelector(".nx-menu-logo")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@class='nx-menu-logo']")).click();*/

        driver.findElement(By.cssSelector("#menu-item-4811")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-4811']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#menu-item-5252")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-5252']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("[aria-label='Free Trial']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@aria-label='Free Trial']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#menu-item-3571")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-3571']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("li#menu-item-3571 [title='Blog']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-3571']//a[@title='Blog']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("#menu-item-57714")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-57714']")).click();
       /* driver.navigate().back();
        driver.findElement(By.cssSelector("#menu-item-59514")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-59514']")).click();
         driver.navigate().back();
        driver.findElement(By.cssSelector("#login")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@id='login']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("[name='password']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@name='password']")).click();*/

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }


}
