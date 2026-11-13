package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.Test;

import static testdata.TestData.ISSUE_NAME;
import static testdata.TestData.REPOSITORY;

public class SelenideTest extends TestBase {

    @Test
    public void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        gitHubPage
                .openPage()
                .openSearch()
                .searchFor(REPOSITORY)
                .openRepository(REPOSITORY)
                .openIssues()
                .checkIssue(ISSUE_NAME);
    }
}
