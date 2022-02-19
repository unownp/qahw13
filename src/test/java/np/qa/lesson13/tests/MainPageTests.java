package np.qa.lesson13.tests;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.selector.ByText;
import np.qa.lesson13.pages.LoginPage;
import np.qa.lesson13.pages.MainPage;
import np.qa.lesson13.pages.components.LeftMenu;
import np.qa.lesson13.pages.components.Search;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("properties")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    LeftMenu leftMenu = new LeftMenu();
    Search search = new Search();
    LoginPage loginPage = new LoginPage();

    @Test
    public void changeLanguageTest() {

        leftMenu.englishButton.shouldHave(text("English"));
        leftMenu.englishButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(leftMenu.englishUrl, currentUrl);
    }

    @Test
    public void mainPageButtonTests() {

        mainPage.mainHeadDiscussButton.click();
        mainPage.mainHeadMainPageButton.click();
        mainPage.mainHeadDiscussButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(mainPage.mainPageDiscussUrl, currentUrl);
    }

    @Test
    public void searchTest() {

        search.inputSearch.setValue("Википедия");
        search.searchButton.click();
    }

    @Test
    public void mainPageTest() {

        leftMenu.mainLogo.shouldBe(visible);
        mainPage.mainTopWriting.shouldHave(text("Добро пожаловать в"));
    }

    @Test
    public void loginTest() {

        mainPage.loginButton.click();
        loginPage.loginInput.shouldBe(visible);
        loginPage.passInput.shouldBe(visible);
    }
}
