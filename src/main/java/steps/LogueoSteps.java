package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.LogueoPageObject;

public class LogueoSteps {

    LogueoPageObject logueoPOM = new LogueoPageObject();

    @Step
    public void abrirAplicacionFullStark() throws InterruptedException {
        logueoPOM.open();

    }

}


