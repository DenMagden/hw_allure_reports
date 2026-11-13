package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {
    // Elements
    private final SelenideElement
            searchButton = $("button[aria-label*='Search or jump to']"),
            searchInput= $("input[aria-label*='Search or jump to']");

    // Actions
    public GitHubPage openPage() {
        open("/");

        return this;
    }

    public GitHubPage openSearch() {
        searchButton.click();

        return this;
    }

    public GitHubSearchResultsPage searchFor(String value) {
        searchInput.setValue(value).pressEnter();

        return new GitHubSearchResultsPage();
    }
}
