package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.BusquedaDeClientePageObject;
import pageobjects.LogueoPageObject;
import utils.EsperaImplicita;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BusquedaDeClienteSteps {

    BusquedaDeClientePageObject busquedaDeClientePageObjectPOM = new BusquedaDeClientePageObject();

    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step

    public void clickSeleccionar() {
        esperaImplicita.esperaImplicitaFrame(5, busquedaDeClientePageObjectPOM.getDriver());
        busquedaDeClientePageObjectPOM.getDriver().findElement(busquedaDeClientePageObjectPOM.getBtnTipoDocumento()).click();
    }


    @Step
    public void clickSuscripcion() throws AWTException, InterruptedException {


        esperaImplicita.esperaExplicita(10);
        busquedaDeClientePageObjectPOM.getDriver().switchTo().parentFrame();

        busquedaDeClientePageObjectPOM.getDriver().switchTo().frame(5);
        esperaImplicita.esperaExplicita(10);
        clickElemento(busquedaDeClientePageObjectPOM.getBtnSuscripciones());

    }

    @Step
    public void clickElemento(By elemento) {
        busquedaDeClientePageObjectPOM.getDriver().findElement(elemento).click();
    }

    @Step
    public void clickOmitir() throws AWTException, InterruptedException {


        esperaImplicita.esperaExplicita(10);
        busquedaDeClientePageObjectPOM.getDriver().switchTo().parentFrame();

        busquedaDeClientePageObjectPOM.getDriver().switchTo().frame(5);
        esperaImplicita.esperaExplicita(10);
        clickElementos(busquedaDeClientePageObjectPOM.getBtnOmitir());

    }

    @Step
    public void clickElementos(By elemento) {
        busquedaDeClientePageObjectPOM.getDriver().findElement(elemento).click();
    }
}
