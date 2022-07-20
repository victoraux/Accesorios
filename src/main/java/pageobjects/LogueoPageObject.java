package pageobjects;



import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://10.203.114.11/oc/bes/sm/login/login-colombia.html")




public class LogueoPageObject extends PageObject {




    By txtCuenta = By.id("ipt_name");
    By txtClave = By.id("ipt_pwd");
    By btnInicio = By.id("loginBtn");
    By btnBuscar = By.xpath("//*[@id='search_info_text']");
    By btnVista360 = By.name("Vista 360° Individual");



    public By getTxtCuenta() {
        return txtCuenta;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnInicio() {
        return btnInicio;
    }

    public By getBtnBuscar(){
        return btnBuscar;
    }
    public By getBtnVista360() {
        return btnVista360;
    }


}