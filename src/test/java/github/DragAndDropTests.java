package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {

    @Test
    void moveElements() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        Configuration.timeout = 10000;
        $("#column-a").dragAndDropTo("#column-b");
        Configuration.timeout = 20000;

        $$("#columns header").first().shouldHave(text("B"));
        $$("#columns header").get(1).shouldHave(text("A"));
    }

}