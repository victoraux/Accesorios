package stepdefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import pageobjects.OfreciendoAlSuscriptorPageObject;
import steps.OfreciendoAlSuscriptorSteps;
import utils.Datos;


import java.awt.*;

public class OfreciendoAlSuscriptorStepdefinitions {

    OfreciendoAlSuscriptorPageObject ofreciendoAlSuscriptorPageObject = new OfreciendoAlSuscriptorPageObject();

    Datos datos = new Datos();

    String[] datosCriterios = datos.getCriterioBusqueda();

    @Steps
    OfreciendoAlSuscriptorSteps ofreciendoAlSuscriptorSteps;



    @Dado("^estoy en el modulo de Ofreciendo al suscripto$")
    public void estoy_en_el_modulo_de_Ofreciendo_al_suscripto() throws AWTException, InterruptedException {
        ofreciendoAlSuscriptorSteps.clickequipo();
        ofreciendoAlSuscriptorPageObject.getDriver().findElement(ofreciendoAlSuscriptorPageObject.getCriterioDeBusqueda0()).click();


    }

    @Cuando("^seleccionar el Accesorio y criterios$")
    public void seleccionar_el_Accesorio_y_criterios() {
        ofreciendoAlSuscriptorPageObject.getDriver().findElement(ofreciendoAlSuscriptorPageObject.getCriterioDeBusqueda()).sendKeys(datosCriterios[0]);

        ofreciendoAlSuscriptorPageObject.getDriver().findElement(ofreciendoAlSuscriptorPageObject.getLupa()).click();

        ofreciendoAlSuscriptorPageObject.getDriver().findElement(ofreciendoAlSuscriptorPageObject.getSuscribir()).click();


    }
}
