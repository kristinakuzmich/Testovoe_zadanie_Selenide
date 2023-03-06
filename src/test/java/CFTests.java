import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class CFTests {
    CFPage page = new CFPage();
    CFResults result = new CFResults();
    @BeforeClass
    public void setup(){
        SingletonDriver sd = SingletonDriver.getInstanceOfSingletonDriver();
    }

    @Test
    public void negativetest(){
        page.setLogin("bnbkass36");
        page.setPassword("cash_bnb123");
        page.clickButton();
        result.isExpectedText("Неверное имя пользователя или пароль.");
    }
    @Test
    public void positivetest(){
        page.setLogin("bnbkass36");
        page.setPassword("cash_bnb");
        page.clickButton();
        result.isExpectedName("Кузьмич М.И.");
        page.exit();
    }
}
