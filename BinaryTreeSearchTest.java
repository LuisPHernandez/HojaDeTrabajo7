import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeSearchTest {
    @Test
   public void insertTest(){
    BinarySearchTree<Long> searchTree = new BinarySearchTree<>();
    //Empezar a agregar nodos, Usar Long porque asi es el csv del ejercicio
    Node<Long> nodo1 = new Node<>(897625L);

    Node<Long> nodo2 = new Node<>(2482750L);

    searchTree.insert(nodo1);
    searchTree.insert(nodo2);
    // verificar que la busqueda devuelva un valor, para asegurarnos de que se inserto el nodo
    //Tambien evaluamos la funcion de busqeuda del arbol
    assertNotNull(searchTree.search(897625L));
    assertNotNull(searchTree.search(2482750L));

   }
   

    

    
}
