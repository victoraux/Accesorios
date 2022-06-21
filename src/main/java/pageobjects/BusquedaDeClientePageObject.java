package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaDeClientePageObject extends PageObject {

    By iFrameMenuClientes = By.xpath("//iframe[@innerid='6013112201611021421']");


    By btnTipoDocumento = By.xpath("//*[@id=\"idTypeDroplistSelect\"]");

    By btnSeleccionarCedula = By.xpath("//*[@title='Cédula de Ciudadania']");

    By txtIdentificacion = By.xpath("//*[@id='idNumber']");

    By btnBuscarCliente = By.id("searchBasicInfo");

    By btnSuscripciones = By.xpath("//span[contains(text(),'Suscripciones')]");


    By btnTramites = By.xpath("//span[contains(text(),'TRAMITES')]");

    By btnVentaDeRecurso = By.xpath("//a[contains(text(),'Venta de recurso')]");


    By btnOmitir = By.xpath("//span[contains(text(),'Omitir')]");


    public By getiFrameMenuClientes() {
        return iFrameMenuClientes;
    }

    public By getBtnTipoDocumento() {
        return btnTipoDocumento;
    }

    public By getBtnSeleccionarCedula() {
        return btnSeleccionarCedula;
    }

    public By getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public By getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    public By getBtnSuscripciones() {
           return btnSuscripciones;
    }

    public By getBtnTramites() {
        return btnTramites;
    }

    public By getBtnVentaDeRecurso() {
        return btnVentaDeRecurso;
    }

    public By getBtnOmitir() {return btnOmitir;
    }
}
