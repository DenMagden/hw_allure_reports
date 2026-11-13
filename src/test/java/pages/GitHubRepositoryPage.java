package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubRepositoryPage {

    private final SelenideElement
            issueTab = $("[data-tab-item='issues']");

    public GitHubRepositoryPage openIssues() {
        issueTab.click();

        return this;
    }

    public GitHubRepositoryPage checkIssue(String value) {
        $(withText(value)).should(Condition.exist);

        return this;
    }
}
