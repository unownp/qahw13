package np.qa.lesson13.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Search {
    public SelenideElement search = $("#simpleSearch"),
            inputSearch = search.$(".vector-search-box-input"),
            searchButton = search.$("#searchButton");

}
