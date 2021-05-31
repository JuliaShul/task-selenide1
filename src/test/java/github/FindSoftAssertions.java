package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindSoftAssertions {

  @Test
  void checkWikiPage() {
    // открыть страничку раздела Wiki проекта
    open("https://github.com/selenide/selenide/wiki");

    // проверить, что в списке страниц (Pages) есть страница SoftAssertions
    $("[id=wiki-pages-filter]").contextClick().setValue("SoftAssertions");
    // открыть страницу SoftAssertions
    $("[data-filterable-for=wiki-pages-filter]]").$(byText("SoftAssertions")).click();
    //проверить, что заголовок содержит SoftAssertions
    $("h1").shouldHave(text("SoftAssertions"));
    // проверить, что внутри есть пример кода для JUnit5

  }

}
//    // подвести мышку к первому элементу в области Contributors
//    $(".BorderGrid").$(byText("Contributors"))
//            .closest("div").$("li").hover();
//    // проверка: в появившемся окошечке (overlay)
//    $$(".Popover-message").findBy(visible)
//            .shouldHave(text("Andrei Solntsev"));