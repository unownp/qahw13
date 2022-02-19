package np.qa.lesson13.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenu {
    public SelenideElement
            leftMenu=$("#mw-panel"),
            mainLogo = leftMenu.$("#p-logo"),
            languagePanel=leftMenu.$(".mw-portlet-lang"),
            englishArea=languagePanel.$(".interwiki-en"),
            englishButton=englishArea.$(".interlanguage-link-target");
    public String englishUrl="https://en.wikipedia.org/wiki/Main_Page";
}
