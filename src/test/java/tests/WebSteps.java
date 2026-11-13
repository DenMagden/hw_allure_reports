package tests;

import io.qameta.allure.Step;

public class WebSteps extends TestBase {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        gitHubPage.openPage();
    }

    @Step("Ищем репозиторий {repo}")
    public void searchForRepository(String repo) {
        gitHubPage
                .openSearch()
                .searchFor(repo);
    }

    @Step("Кликаем по ссылке репозитория {repo}")
    public void clickOnRepositoryLink(String repo) {
        gitHubSearchResultsPage.openRepository(repo);
    }

    @Step("Открываем таб Issues")
    public void openIssuesTab() {
        gitHubRepositoryPage.openIssues();
    }

    @Step("Проверяем наличие Issue с названием {issueName}")
    public void shouldSeeIssueWithNumber(String issueName) {
        gitHubRepositoryPage.checkIssue(issueName);
    }
}