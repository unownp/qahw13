package np.qa.lesson13.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement
            mainTop = $(".main-top"),
            mainTopLeft = mainTop.$(".main-top-left"),
            mainTopWriting = mainTopLeft.$(".mw-headline"),
            mainHead = $("#mw-head"),
            mainHeadDiscussButton = mainHead.$("#ca-talk"),
            mainHeadMainPageButton = mainHead.$("#ca-nstab-main"),
            loginButton = $("#pt-login").$("a");
    public String ruWikiBase = "https://ru.wikipedia.org/wiki/",
            mainPageUrl = ruWikiBase +
                    "%D0%9E%D0%B1%D1%81%D1%83%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5:%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0",
            mainPageDiscussUrl = ruWikiBase +
                    "%D0%9E%D0%B1%D1%81%D1%83%D0%B6%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5:%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";

}
