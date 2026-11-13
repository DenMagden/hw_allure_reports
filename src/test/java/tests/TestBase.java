package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.GitHubPage;
import pages.GitHubRepositoryPage;
import pages.GitHubSearchResultsPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    GitHubPage gitHubPage = new GitHubPage();
    GitHubRepositoryPage gitHubRepositoryPage = new GitHubRepositoryPage();
    GitHubSearchResultsPage gitHubSearchResultsPage = new GitHubSearchResultsPage();

    @BeforeAll
    static void configurationBrowser() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
    }

    @AfterEach
    void closeDriver() {
        closeWebDriver();
    }
}
