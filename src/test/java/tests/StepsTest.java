package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static testdata.TestData.ISSUE_NAME;
import static testdata.TestData.REPOSITORY;

public class StepsTest extends TestBase {

    @Test
    public void testLambdaStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу", () -> {
            gitHubPage.openPage();
        });
        step("Ищем репозиторий " + REPOSITORY, () -> {
            gitHubPage
                    .openSearch()
                    .searchFor(REPOSITORY);
        });
        step("Кликаем по ссылке репозитория " + REPOSITORY, () -> {
            gitHubSearchResultsPage.openRepository(REPOSITORY);
        });
        step("Открываем таб Issues", () -> {
            gitHubRepositoryPage.openIssues();
        });
        step("Проверяем наличие Issue с названием " + ISSUE_NAME, () -> {
            gitHubRepositoryPage.checkIssue(ISSUE_NAME);
        });
    }
}
