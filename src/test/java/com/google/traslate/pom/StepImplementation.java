package com.google.traslate.pom;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import static  org.junit.Assert.*;

public class StepImplementation {


    private WebDriver driver;
    TraslatePage traslatePage;
    @Step("The user open de browser")
    public void theUserOpenDeBrowser() throws Exception{ 
        traslatePage = new TraslatePage(driver);
        driver = traslatePage.chromeDriverConnection();
        traslatePage.visit("https://translate.google.com/?sl=en&tl=es");
    }
    @Step("type <text> to traslate")
    public void typeToTraslate(String text) throws Exception{
        traslatePage.typeTextToTranslate(text);
    }
    
    @Step("the user should be see the <traslatedText>")
    public void theUserShouldBeSeeThe(String traslatedText) throws Exception{
        assertEquals(traslatedText,traslatePage.textAlreadyTranslated());
        driver.quit();
    }
   
}
