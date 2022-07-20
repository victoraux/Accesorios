package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VentaDeRecursoPageObject extends PageObject {

    By btnRazonVenta = By.xpath("//*[@id=\"selectReasonForSale\"]");
    By SeleccionarOtros = By.xpath("//span[contains(text(),'Otros')]");

    By btnTipoLote = By.xpath("//*[@id=\"selectLotValueForSale\"]");

    By SeleccionarNuevo = By.xpath("//span[contains(text(),'Nuevo')]");

    By BtnAnadirRecurso = By.xpath("//span[contains(text(),'Añadir recurso')]");



    public By getBtnRazonVenta() {
        return btnRazonVenta;
    }

    public By getSeleccionarOtros() {
        return SeleccionarOtros;
    }

    public By getBtnTipoLote() {
        return btnTipoLote;
    }

    public By getSeleccionarNuevo() {
        return SeleccionarNuevo;
    }

    public By getBtnAnadirRecurso() {
        return BtnAnadirRecurso;
    }


}


