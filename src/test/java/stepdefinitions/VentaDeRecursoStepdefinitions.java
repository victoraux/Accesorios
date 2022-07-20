package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import pageobjects.BusquedaDeClientePageObject;
import pageobjects.VentaDeRecursoPageObject;
import steps.BusquedaDeClienteSteps;
import steps.VentaDeRecursoSteps;

import java.awt.*;

public class VentaDeRecursoStepdefinitions {

    VentaDeRecursoPageObject ventaDeRecursoPageObject = new VentaDeRecursoPageObject();

    @Steps
    VentaDeRecursoSteps ventaDeRecursoSteps;

    @Dado("^estoy en el modulo de venta de recurso$")
    public void estoy_en_el_modulo_de_venta_de_recurso() {
        ventaDeRecursoPageObject.getDriver().findElement(ventaDeRecursoPageObject.getBtnRazonVenta()).click();
        ventaDeRecursoPageObject.getDriver().findElement(ventaDeRecursoPageObject.getBtnRazonVenta()).click();


    }


    @Cuando("^seleccionar el recurso$")
    public void seleccionar_el_recurso() {


        ventaDeRecursoPageObject.getDriver().findElement(ventaDeRecursoPageObject.getSeleccionarOtros()).click();
        ventaDeRecursoPageObject.getDriver().findElement(ventaDeRecursoPageObject.getBtnTipoLote()).click();
        ventaDeRecursoPageObject.getDriver().findElement(ventaDeRecursoPageObject.getSeleccionarNuevo());
        ventaDeRecursoPageObject.getDriver().findElement(ventaDeRecursoPageObject.getBtnAnadirRecurso()).click();

    }

}
