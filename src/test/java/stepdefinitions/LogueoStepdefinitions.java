package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import pageobjects.LogueoPageObject;
import steps.LogueoSteps;
import utils.Datos;


public class LogueoStepdefinitions {

    LogueoPageObject logueoPageObject = new LogueoPageObject();
    Datos datos = new Datos();

    String [] datosUsuario = datos.getDatos();


    @Steps
    LogueoSteps logueoSteps;


    @Dado("^estoy en la pagina de inicio de FullStark$")
    public void estoyEnLaPaginaDeInicioDeFullStark() throws InterruptedException {
        logueoSteps.abrirAplicacionFullStark();



      }


    @Cuando("^ingreso mis credenciales$")
    public void ingresoMisCredenciales() {
        logueoPageObject.getDriver().findElement(logueoPageObject.getTxtCuenta()).sendKeys(datosUsuario[0]);
        logueoPageObject.getDriver().findElement(logueoPageObject.getTxtClave()).sendKeys(datosUsuario[1]);
        logueoPageObject.getDriver().findElement(logueoPageObject.getBtnInicio()).click();
        logueoPageObject.getDriver().findElement(logueoPageObject.getBtnBuscar()).sendKeys("Vista 360° Individual");
        logueoPageObject.getDriver().findElement(logueoPageObject.getBtnVista360()).click();



    }

}
