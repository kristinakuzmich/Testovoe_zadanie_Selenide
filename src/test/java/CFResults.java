import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
public class CFResults {
    public void isExtectedResult(String text){
        $x("//span[text()='������� �.�.']")
                .shouldBe(Condition.exactText(text));
        sleep(3000);
    }
}
