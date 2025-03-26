import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TreeControllerTest {
    @Test// BUscar elemento que no existe, debe devolver que no esta en la lista 
    public void testBuscarElemento(){
        TreeController controller = new TreeController("Data.csv");
        controller.initiate();
        Long producto = 123455L;// SKu que no existe 
        List<String> busqueda = controller.searchProduct(producto);
        assertEquals(List.of("Producto no encontrado"), busqueda);// el programa deber hacer el corrido de la listay devolver el texto de que no existe el SKU
    }
    @Test
    public void testBuscarElementoExistente(){
        // ahora buscara un SKU que si existe en la lista
        TreeController controller = new TreeController("Data.csv");
        controller.initiate();
        Long SKU = 5001252387L; // primer SKU de la lista elegido manualmente
        List<String> busqueda = controller.searchProduct(SKU);// busqeuda deberia tener la lista de todas las especificaiones solicitadas del producot.
        assertEquals(List.of("17.2-cu ft Counter-depth Bottom-Freezer Refrigerator (Fingerprint Resistant Stainless Steel) ENERGY STAR", "999.0", "999.0","Refrigerators"),busqueda);
    }
        



    
}
