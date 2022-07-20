package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OfreciendoAlSuscriptorPageObject extends PageObject {



   By CategoriaOferta = By.xpath("//*[@id=\"productcatagory1\"]//a[normalize-space()='Equipos']");
    By CriterioDeBusqueda0 = By.xpath("//*[@id=\"at__GoodsType\"]/div[7]/div/div[2]//input[@id='inputquerystring']");
   By CriterioDeBusqueda = By.xpath("//*[@id=\"at__GoodsType\"]/div[7]/div/div[2]//input[@id='inputquerystring']");
   By Lupa = By.xpath("//*[@id=\"productquerybtn\"]");

   // By Suscribir = By.xpath("//p[@title='Código:7738 (Nombre de la OfertaMOTO G60)']");
    By Suscribir = By.xpath("//div[@id='productaddtocar7738']");




    public By getCategoriaOferta() {
        return CategoriaOferta;
    }

    public By getCriterioDeBusqueda0() {
        return CriterioDeBusqueda0;
    }

    public By getCriterioDeBusqueda() {
           return CriterioDeBusqueda;

        }

    public By getLupa() {
        return Lupa;
    }

    public By getSuscribir() {
        return Suscribir;
    }
}
