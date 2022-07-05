package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BasePage;

public class TransferFundsPage extends BasePage {

    private static final String amount = "1000";

    // Transferir fondos
    private static final By locatorTransferFundsButton = By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a");
    private static final By locatorAmountInput = By.id("amount");
    private static final By locatorFromAccountList = By.id("fromAccountId");
    private static final By locatorToAccountList = By.id("toAccountId");
    private static final By locatorFromAccount = By.xpath("//*[@id=\"fromAccountId\"]/option[1]");
    private static final By locatorToAccount = By.xpath("//*[@id=\"toAccountId\"]/option[2]");
    private static final By locatorConfirmTransButton = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input");

    
    public void openTransferFundsPage() throws InterruptedException {
        clickWithSleep(locatorTransferFundsButton, 2000);
    }

    public void completeTransferFields() throws InterruptedException {
        insertInputWithSleep(locatorAmountInput, amount, 1000);

        clickWithSleep(locatorFromAccountList, 1000);
        clickWithSleep(locatorFromAccount, 1000);
        clickWithSleep(locatorToAccountList, 1000);
        clickWithSleep(locatorToAccount, 1000);
        clickWithSleep(locatorConfirmTransButton, 1000);
    }

}
