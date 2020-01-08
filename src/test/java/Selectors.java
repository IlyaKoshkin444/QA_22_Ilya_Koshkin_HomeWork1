import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectors extends TestBase {

    @Test
    public void NginxElementsTest() throws InterruptedException {
       openSite("https://www.nginx.com/");

       wd.findElement(By.cssSelector("#menu-item-57695")).click();
       wd.navigate().back();
       wd.findElement(By.xpath("//li[@id='menu-item-57695']")).click();

        /*driver.navigate().back();
        driver.findElement(By.cssSelector("#menu-item-53220")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-53220']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("li#menu-item-53220 [title='NGINX Plus']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//li[@id='menu-item-53220']//a[@title='NGINX Plus']")).click();*/
       // driver.navigate().back();
        wd.findElement(By.cssSelector("nav#nx-site-navigation div.search-form-wrapper")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//nav[@id='nx-site-navigation']//div[@class='search-form-wrapper']")).click();
       // driver.navigate().back();
        /*driver.findElement(By.cssSelector(".nx-menu-logo")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@class='nx-menu-logo']")).click();*/

        wd.findElement(By.cssSelector("#menu-item-4811")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//li[@id='menu-item-4811']")).click();
        wd.navigate().back();
        wd.findElement(By.cssSelector("#menu-item-5252")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//li[@id='menu-item-5252']")).click();
        wd.navigate().back();
        wd.findElement(By.cssSelector("[aria-label='Free Trial']")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//a[@aria-label='Free Trial']")).click();
        wd.navigate().back();
        wd.findElement(By.cssSelector("#menu-item-3571")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//li[@id='menu-item-3571']")).click();
        wd.navigate().back();
        wd.findElement(By.cssSelector("li#menu-item-3571 [title='Blog']")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//li[@id='menu-item-3571']//a[@title='Blog']")).click();
        wd.navigate().back();
        wd.findElement(By.cssSelector("#menu-item-57714")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//li[@id='menu-item-57714']")).click();
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


}
