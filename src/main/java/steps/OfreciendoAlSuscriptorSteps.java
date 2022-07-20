package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import pageobjects.OfreciendoAlSuscriptorPageObject;

import utils.EsperaImplicita;

import java.awt.*;


public class OfreciendoAlSuscriptorSteps {

    OfreciendoAlSuscriptorPageObject ofreciendoAlSuscriptorPageObjectPOM = new OfreciendoAlSuscriptorPageObject();

   EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Step
    public void clickequipo() throws AWTException, InterruptedException {


        esperaImplicita.esperaExplicita(5);
        ofreciendoAlSuscriptorPageObjectPOM.getDriver().switchTo().parentFrame();
        ofreciendoAlSuscriptorPageObjectPOM.getDriver().switchTo().frame(7);
        esperaImplicita.esperaExplicita(5);
        clickElementoEquipo(ofreciendoAlSuscriptorPageObjectPOM.getCategoriaOferta());


    }

    @Step
    public void clickElementoEquipo(By elemento) {
        ofreciendoAlSuscriptorPageObjectPOM.getDriver().findElement(elemento).click();
    }

    }

