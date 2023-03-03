import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$x;
public class CFPage {
    public void setLogin(String text) {
        $x("//div[@class='login-form']//input[@id='j_username']")
                .setValue(text)
                .shouldBe(Condition.value(text));
    }
    public void setPassword(String text) {
        $x("//div[@class='login-form']//input[@id='j_password']")
                .setValue("cash_bnb")
                .shouldBe(Condition.value("cash_bnb"));
    }
    public void clickButton() {
        $x("//div[@class='login-form']//input[@name='loginButton']")
                .shouldBe(Condition.visible)
                .click();
    }
    public void exit() {
        $x("//button[@id='header-form:logoutLink']")
                .shouldBe(Condition.visible)
                .click();
    }
}
