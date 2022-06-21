package utils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
public class Datos {
    public String[] getDatos() {
        String excel = "Datos.xlsx";
        String usuario = null;
        String clave = null;
        try {
            FileInputStream file = new FileInputStream(new File(excel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("DatosUsuario");
            Row row;
            Cell cell;
            row = hoja.getRow(1);
            cell = row.getCell(0);
            usuario = cell.toString();
            cell = row.getCell(1);
            clave = cell.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String datosUsuario[] = {usuario, clave,};
        return datosUsuario;


}

    public String[] getBusquedaCliente() {
        String excel = "Datos.xlsx";
        String identificacion = null;

        try {
            FileInputStream file = new FileInputStream(new File(excel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("BusquedaDeUsuario");
            Row row;
            Cell cell;
            row = hoja.getRow(1);
            cell = row.getCell(0);
            identificacion = cell.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String datosIdentificacion[] = {identificacion};
        return datosIdentificacion;



    }
}