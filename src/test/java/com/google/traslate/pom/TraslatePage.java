package com.google.traslate.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TraslatePage extends Base {
    public TraslatePage(WebDriver driver) {
        super(driver);
    }
    public void typeTextToTranslate(String textToTranslate) throws InterruptedException {
        click(TXT_TEXT_TO_TRASLATE);
        type(textToTranslate,TXT_TEXT_TO_TRASLATE);
        Thread.sleep(1000);
    }

    public String textAlreadyTranslated(){
        String textTranslated = getText(TXT_TEXT_ALREADY_TRANSLATED);
        return  textTranslated;
    }

    By TXT_TEXT_TO_TRASLATE =  By.xpath("//textarea[contains(@aria-label,'Texto original')]");
    By TXT_TEXT_ALREADY_TRANSLATED = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]/span[1]/span/span");
    By BTN_SELECT_LANGUAGE_TO_TRASLATE = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/button");
    By BTN_SELECT_LANGUAGE_TO_BE_TRASLATE = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[5]/button");
  // TODO Mapear lenguajes
}
