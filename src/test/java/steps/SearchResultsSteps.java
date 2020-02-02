package steps;

import pages.SearchResultsPage;

public class SearchResultsSteps {
    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    public SearchResultsSteps verifyThatValuesAreCorrect(String text) {
        searchResultsPage.assertThatValuesContainText(text);
        return this;
    }
}
