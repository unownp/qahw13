package np.qa.lesson13.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            loginInput = $("#wpName1"),
            passInput = $("#wpPassword1");
}
