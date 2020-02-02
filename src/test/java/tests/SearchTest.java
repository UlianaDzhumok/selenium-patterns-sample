package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void searchByKeywordSelenium(String text) throws InterruptedException {

        steps.searchByKeyword(text)
                .verifyThatValuesAreCorrect("selenium");
    }
}
