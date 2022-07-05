package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BasePage;

public class AccountOverviewPage extends BasePage {
    
    // Resumen de las cuentas
    private static final By locatorAccountsOverwievButton = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");

    // Actividad de la cuenta (cada mes)
    private static final By locatorAccountButton = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");
    private static final By locatorPeriodOfActivityList = By.id("month");
    private static final By locatorAllMonthsOption= By.xpath("//*[@id=\"month\"]/option[1]");
    private static final By locatorTransactionTypeList = By.id("transactionType");
    private static final By locatorTransactionTypeOption = By.xpath("//*[@id=\"transactionType\"]/option[1]");
    private static final By locatorSearchButton = By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");
    
    public void openAccountsOverviewPage() throws InterruptedException {
        clickWithSleep(locatorAccountsOverwievButton, 2000);
    }

    public void openAccountsDetails() throws InterruptedException {
        clickWithSleep(locatorAccountButton, 2000);
    }

    public void seeAccountActivity() throws InterruptedException {

        clickWithSleep(locatorPeriodOfActivityList, 1000);
        clickWithSleep(locatorAllMonthsOption, 1000);
        clickWithSleep(locatorTransactionTypeList, 1000);
        clickWithSleep(locatorTransactionTypeOption, 1000);
        clickWithSleep(locatorSearchButton, 0);
    }
}
