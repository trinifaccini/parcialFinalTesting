package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver _driver;

    protected static final String url = "https://parabank.parasoft.com/parabank/index.htm";

    public BasePage() {
        if (_driver == null){
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chomedriver/chromedriver");
            _driver = new ChromeDriver();
            //_driver.manage().window().maximize(); // VOLVER A AGREGAR! 
        } 
    }
    
    public void openApp(){
        _driver.get(url);
    }

    public WebDriver getDriver() {
        return _driver;
    }

    public String getPageTitle() {
        return _driver.getTitle();
    }

    public WebElement getWebElement(By locator) {

        WebElement elem = null;

        try {
            elem = _driver.findElement(locator);
        }
        catch(Exception e) {
            System.out.println("No existe el elemento: " + locator);
            System.out.println("Excepción: " + e);
        }

        return elem;
    }

    public void insertInput(By locator, String text){ 
        WebElement input = getWebElement(locator);
        input.clear();
        input.sendKeys(text);
    }

    public void insertInputWithSleep(By locator, String text, long time) throws InterruptedException {
        insertInput(locator, text);
        Thread.sleep(time);
    }

    public void clickWithSleep(By locator, long time) throws InterruptedException {
        WebElement element = getWebElement(locator);
        element.click();
        Thread.sleep(time);
    }

    public boolean textSearch(By locator, String search){

        WebElement content = getWebElement(locator);
		String result = content.getText();
        return result.contains(search);

    }
}
