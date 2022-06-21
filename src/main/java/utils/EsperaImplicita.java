package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EsperaImplicita {


    public void esperaImplicitaFrame(int frame, WebDriver driver) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
        myWaitVar.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

    }

    public void esperaImplicitaFrameParent(WebDriver driver) {
        driver.switchTo().parentFrame();
    }

    public void esperaExplicita ( int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }

    }
}