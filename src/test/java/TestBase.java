import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {


    WebDriver wd;

    @BeforeSuite
    public void setUp() {
        String browser =
                System.getProperty("browser", BrowserType.CHROME);
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.SAFARI)) {
            wd = new SafariDriver();
        }

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



    }


    @AfterSuite
    public void tearDown() {
        wd.quit();

    }



    public void openSite(String url) {
        wd.get(url);
    }

    public void selectLangEN() {
        wd.findElement(By.id("js-link-box-en")).click();
    }

    public void initlogin() {
        wd
                .findElement(By.id("pt-login")).click();
    }

    public void fillLoginForm(String user, String password) {
        Type(By.id("wpName1"), user);
        Type(By.id("wpPassword1"), password);
    }

    public void Type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void pause() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void clickLogInButton() throws InterruptedException {
        wd.findElement(By.id("wpLoginAttempt")).click();
        pause();
    }
}
