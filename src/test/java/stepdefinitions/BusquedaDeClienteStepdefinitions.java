package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import pageobjects.BusquedaDeClientePageObject;
import steps.BusquedaDeClienteSteps;
import steps.LogueoSteps;
import utils.Datos;

import java.awt.*;

public class BusquedaDeClienteStepdefinitions {


    BusquedaDeClientePageObject busquedaDeClientePageObject = new BusquedaDeClientePageObject();

    Datos datos = new Datos();

    String [] datosIdentificacion = datos.getBusquedaCliente();

    @Steps
    BusquedaDeClienteSteps busquedaDeClienteSteps;

    @Dado("^estoy en el modulo de cliente$")
    public void estoy_en_el_modulo_de_cliente() {

        busquedaDeClienteSteps.clickSeleccionar();
        busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getBtnSeleccionarCedula()).click();




    }


    @Cuando("^ingreso numero de identificacion$")
    public void ingreso_numero_de_identificacion() throws AWTException, InterruptedException {
        busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getTxtIdentificacion()).click();
        busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getTxtIdentificacion()).sendKeys(datosIdentificacion[0]);
        busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getBtnBuscarCliente()).click();
        busquedaDeClienteSteps.clickSuscripcion();
        busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getBtnTramites()).click();
        busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getBtnVentaDeRecurso()).click();
      //  busquedaDeClientePageObject.getDriver().findElement(busquedaDeClientePageObject.getBtnOmitir()).click();
        busquedaDeClienteSteps.clickOmitir();
    }

}
