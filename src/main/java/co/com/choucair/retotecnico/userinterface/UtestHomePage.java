package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestHomePage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button to join in").located(By.xpath("//li//a[contains(text(),'Join Today')]"));
}
