package np.qa.lesson13.tests;

import com.codeborne.selenide.WebDriverRunner;
import np.qa.lesson13.pages.LoginPage;
import np.qa.lesson13.pages.MainPage;
import np.qa.lesson13.pages.components.LeftMenu;
import np.qa.lesson13.pages.components.Search;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("properties")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LeftMenu leftMenu = new LeftMenu();
    Search search = new Search();
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Проверка переключения языка")
    public void changeLanguageTest() {
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Наличие английского", () -> {
            leftMenu.englishButton.shouldHave(text("English"));
        });
        step("Переключение на английский", () -> {
            leftMenu.englishButton.click();
        });
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        step("Соотвествие урла с ожидаемым значением", () -> {
            assertEquals(leftMenu.englishUrl, currentUrl);
        });
    }

    @Test
    @DisplayName("Проверка кнопок главной страницы")
    public void mainPageButtonTests() {
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Переход на страницу обсуждения", () -> {
            mainPage.mainHeadDiscussButton.click();
        });
        step("Переход на главную", () -> {
            mainPage.mainHeadMainPageButton.click();
        });
        step("Переход на страницу обсуждения", () -> {
            mainPage.mainHeadDiscussButton.click();
        });
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        step("Соотвествие урла с ожидаемым значением", () -> {
            assertEquals(mainPage.mainPageDiscussUrl, currentUrl);
        });
    }

    @Test
    @DisplayName("Проверка поиска")
    public void searchTest() {
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Ввод в поле поиска текста", () -> {
            search.inputSearch.setValue("Википедия");
        });
        step("Нажатие на кнопку поиска", () -> {
            search.searchButton.click();
        });
    }

    @Test
    @DisplayName("Проверка заголовков")
    public void mainPageTest() {
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Проверка главного лого", () -> {
            leftMenu.mainLogo.shouldBe(visible);
        });
        step("Проверка наличия основного заголовка", () -> {
            mainPage.mainTopWriting.shouldHave(text("Добро пожаловать в"));
        });
    }

    @Test
    @DisplayName("Проверка страницы авторизации")
    public void loginTest() {
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Переход на страницу авторизации", () -> {
            mainPage.loginButton.click();
        });
        step("Наличие поля ввода логина", () -> {
            loginPage.loginInput.shouldBe(visible);
        });
        step("Наличие поля ввода пароля", () -> {
            loginPage.passInput.shouldBe(visible);
        });
    }
}
