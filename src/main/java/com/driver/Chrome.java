package com.driver;

import com.data.GetData;
import com.log.log;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends GetData {
    public static WebDriver driver;

    @Step("Chrome açılır")
    public Chrome open(String URL) {
        System.setProperty(ChromeDriver,ChromeDriverPATH);
        driver = new ChromeDriver();
        driver.get(URL);
        log.info("Tarayıcı Üzerinde " + URL + "giriş yapılır");
        driver.manage().window().maximize();
        return this;
    }

}