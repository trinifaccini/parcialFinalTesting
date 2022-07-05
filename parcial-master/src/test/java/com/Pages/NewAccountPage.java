package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BasePage;

public class NewAccountPage extends BasePage {

    // Abrir una cuenta nueva
    private static final By locatorOpenAccountButton = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
    private static final By locatorOptionsList = By.id("type");
    private static final By locatorOption = By.xpath("//*[@id=\"type\"]/option[2]");
    private static final By locatorOpenAccount = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");

    public void openNewAccountPage() throws InterruptedException {
        clickWithSleep(locatorOpenAccountButton, 2000);
    }

    public void openAccount() throws InterruptedException {

        clickWithSleep(locatorOptionsList, 1000);
        clickWithSleep(locatorOption, 1000);
        clickWithSleep(locatorOpenAccount, 1000);
    }
}