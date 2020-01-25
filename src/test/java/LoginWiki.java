import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class LoginWiki extends TestBase {


    @Test
    public void openWikipediaTest() throws InterruptedException {
        selectLangEN();
        pause();
        initlogin();
        pause();
        //fill login form
        fillLoginForm("Eliyahu.Kosh", "wiki23081967");
        pause();
        clickLogInButton();

    }


}
