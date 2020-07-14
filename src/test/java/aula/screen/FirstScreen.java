package aula.screen;



import aula.capabilities.AndroidCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FirstScreen {
    public FirstScreen(){
        PageFactory.initElements( new AppiumFieldDecorator(AndroidCapabilities.getDriver()), this );
    }

    @WithTimeout(time = 15000 , unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "home_omdb")
    private MobileElement tela_inicial;

    @AndroidFindBy(id = "search_title")
    private MobileElement digite_nome;

    @AndroidFindBy(id = "search")
    private MobileElement btn_search;

    @AndroidFindBy(id = "year")
    private MobileElement ano;


    public void home() {
        this.tela_inicial.isDisplayed();
    }

    public void digite_nome() {
        this.digite_nome.sendKeys("spider");
    }

    public void ano() {
        this.ano.sendKeys("1990");
    }


    public void btn_search() {
        this.btn_search.click();
    }
}
