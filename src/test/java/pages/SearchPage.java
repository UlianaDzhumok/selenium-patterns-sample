package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchField;

    public SearchPage() {
        super();
    }


    public void fillTheSearchField(String keyword) {
        wait.until(ExpectedConditions.visibilityOfAllElements(searchField));
        searchField.sendKeys(keyword);
    }

    public void pressEnter() {
        searchField.sendKeys(Keys.RETURN);
    }
}
