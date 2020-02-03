package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {

    @FindBy(className = "LC20lb")
    private List<WebElement> searchResults;

    public SearchResultsPage() {
        super();
    }

    ;

    public void assertThatValuesContainText(String text) {
        wait.until(ExpectedConditions.visibilityOfAllElements(searchResults));
        searchResults.forEach(WebElement -> assertThat(WebElement.getText()).containsIgnoringCase(text));
    }
}
