import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
public class CFResults {
    public void isExpectedName(String text){
        $x("//span[text()='Кузьмич М.И.']")
                .shouldBe(Condition.exactText(text));
    }
    public void isExpectedText(String text){
        $x("//div[@class='ui-growl-message']//span[text()='Неверное имя пользователя или пароль.']")
                .shouldBe(Condition.exactText(text));
    }

}
