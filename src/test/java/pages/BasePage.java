package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public abstract class BasePage {
    private WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = BaseTest.getDriver();
        PageFactory.initElements(driver, this);
        wait=new WebDriverWait(driver,5);
    }
}
