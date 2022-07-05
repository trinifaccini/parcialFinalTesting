package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BasePage;

public class RegisterPage extends BasePage{

    // Registro
    private static final By locatorRegisterButton= By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    private static final By locatorInputFirstName = By.id("customer.firstName");
    private static final By locatorInputLastName = By.id("customer.lastName");
    private static final By locatorInputStreet = By.id("customer.address.street");
    private static final By locatorInputCity = By.id("customer.address.city");
    private static final By locatorInputState = By.id("customer.address.state");
    private static final By locatorInputZipCode= By.id("customer.address.zipCode");
    private static final By locatorInputPhone = By.id("customer.phoneNumber");
    private static final By locatorInputSSN = By.id("customer.ssn");
    private static final By locatorInputUser= By.id("customer.username");
    private static final By locatorInputPwd = By.id("customer.password");
    private static final By locatorInputRePwd = By.id("repeatedPassword");
    private static final By locatorConfirmButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    private static final String name = "Trinidad";
    private static final String lastName = "Faccini";
    private static final String street = "Totoral 123";
    private static final String city = "Villa La Angostura";
    private static final String state = "Neuquen";
    private static final String zipCode = "8100";
    private static final String phone = "549265842213";
    private static final String ssn = "123943";
    private static final String username = "trinif6";
    private static final String password = "123456hola";


    public void openRegisterPage() throws InterruptedException {
        clickWithSleep(locatorRegisterButton, 2000);
    }

    public void completeRegistrationFields() throws InterruptedException {

        insertInputWithSleep(locatorInputFirstName, name, 1000);
        insertInputWithSleep(locatorInputLastName, lastName, 1000);
        insertInputWithSleep(locatorInputStreet, street, 1000);
        insertInputWithSleep(locatorInputCity, city, 1000);
        insertInputWithSleep(locatorInputState, state, 1000);
        insertInputWithSleep(locatorInputZipCode, zipCode, 1000);
        insertInputWithSleep(locatorInputPhone, phone, 1000);
        insertInputWithSleep(locatorInputSSN, ssn, 1000);
        insertInputWithSleep(locatorInputUser, username, 1000);
        insertInputWithSleep(locatorInputPwd, password, 1000);
        insertInputWithSleep(locatorInputRePwd, password, 1000);
    }

    public void confirmRegistration() throws InterruptedException {

        clickWithSleep(locatorConfirmButton, 0);
    }

}
