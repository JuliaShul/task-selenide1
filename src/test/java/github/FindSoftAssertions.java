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
    open("https://github.com/selenide/selenide");
    $("[data-content=Wiki]").click();
    // ввести в инпут SoftAssertions
    $("#wiki-pages-filter").setValue("SoftAssertions");
    // открыть страницу SoftAssertions
    $(byText("SoftAssertions")).click();
    // проверить, что внутри есть пример кода для JUnit5
    $("[id=wiki-body]").shouldHave(text("Using JUnit5 extend test class"));


  }

}