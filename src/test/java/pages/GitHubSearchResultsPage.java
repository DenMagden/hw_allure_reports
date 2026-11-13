package pages;

import static com.codeborne.selenide.Selenide.$;

public class GitHubSearchResultsPage {

    public GitHubRepositoryPage openRepository(String repository) {
        $("a[href='/" + repository + "']").click();

        return new GitHubRepositoryPage();
    }
}
