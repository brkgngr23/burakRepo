package com.pages;


import com.base.BaseLibrary;
import com.log.log;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class Islemler extends BaseLibrary {


    By btnLogin = By.cssSelector("[name='FormsButton2']");
    By txtUsername= By.cssSelector("[name='username']");
    By txtPassword= By.cssSelector("[type='password']");


    @Step ("Login Butonuna Tıklanır")
    public Islemler btnLogin() {
        driver.findElement(btnLogin).click();
        Allure.addAttachment("login", "Test login butonuna tıklanır");
        log.info("Test login butonuna tıklanır");

        return this;
    }
    @Step ("Kullanıcı id alanı doldurulur")
    public Islemler UsernameDoldur(String username) {

        driver.findElement(txtUsername).sendKeys(username);
        Allure.addAttachment("username", "Username alanı doldurulur");
        log.info("Username alanı doldurulur");
        return this;
    }
    @Step ("Şifre Alanı Dolurulur")
    public Islemler PasswordDoldur(String password) {
        driver.findElement(txtPassword).sendKeys(password);
        Allure.addAttachment("password", "Password alanı doldurulur");
        log.info("şifre alanı doldurulur");

        return this;
    }
    @Step("Login durumu kontrol edilir")
    public Islemler loginDurumuKontrolu (String text) {
        String gelenData= driver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b")).getText();

        Assert.assertEquals(gelenData,text);
        Allure.addAttachment("login durumu","login durum kontrolü başarılı"+ text);
        log.info("login durum kontrolü başarılı");
        takeScreenshot();
        return this;
    }
    @Step ("Sayfa başlık kontrolü yapılır")
    public Islemler sayfaBaslikKontrol (String text) {
        String gelenData= driver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > p:nth-child(4) > big > strong")).getText();

        Assert.assertEquals(gelenData,text);
        Allure.addAttachment("sayfa başlık kontrol","sayfa başlık kontrolü başarılı"+ text);
        log.info("sayfa başlık kontrolü başarılı");
        return this;
    }
    @Step ("Login olunur, gelen hata kontrol edilir")
    public Islemler loginHataKontroluKisa (String text) {

        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage,text);
        Allure.addAttachment("login kontrol","login hata kontrolü başarılı"+ text);
        log.info("login hata kontrolü başarılı");

        return this;
    }
    @Step ("Sayfa bilgi mesajı kontrol edilir")
    public Islemler sayfaBilgiMesajKontrol (String text) {
        String gelenData= driver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > blockquote > blockquote > p")).getText();
        Assert.assertEquals(gelenData,text);
        Allure.addAttachment("sayfa bilgi mesaj kontrol","sayfa bilgi mesajı kontrolü başarılı"+ text);
        log.info("sayfa bilgi mesajı kontrolü başarılı");

        return this;
    }







}