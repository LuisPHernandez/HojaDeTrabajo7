import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeSearchTest {
    /**
     * 
     */
    @Test
    public void searchTest(){
    BinarySearchTree<Long> searchTree = new BinarySearchTree<>();
    //Empezar a agregar nodos, Usar Long porque los números SKU del ejercicio son muy grandes para representarse en int
    Node<Long> nodo1 = new Node<>(897625L);

    searchTree.insert(nodo1);
  
    // El primer nodo debió ponerse como la raíz del árbol
    // Para probar nos aseguramos que la raíz ya no sea null
    assertNotNull(searchTree.getTreeRoot());
   }
   
   /**
 * 
 */
@Test
   public void insertTest(){
    BinarySearchTree<Long> searchTree = new BinarySearchTree<>();
    //Empezar a agregar nodos, Usar Long porque los números SKU del ejercicio son muy grandes para representarse en int
    Node<Long> nodo1 = new Node<>(897625L);

    Node<Long> nodo2 = new Node<>(2482750L);

    searchTree.insert(nodo1);
    searchTree.insert(nodo2);
    
    // Verificar que la busqueda devuelva un valor, para asegurarnos de que se inserto el nodo y que se encontró en el árbol
    assertNotNull(searchTree.search(897625L));
    assertNotNull(searchTree.search(2482750L));
   } 
}
