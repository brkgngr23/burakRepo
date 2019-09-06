package com.base;

import com.driver.Chrome;
import io.qameta.allure.Attachment;
import org.openqa.selenium.*;

public class BaseLibrary extends Chrome {


    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        byte[] bytes = new byte[]{};
        try {
            bytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        } catch (WebDriverException e) {
        }
        return bytes;

    }
}
