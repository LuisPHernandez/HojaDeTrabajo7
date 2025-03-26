import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Inicializar el controlador con el archivo de datos
        TreeController controller = new TreeController("Data.csv");
        
        // Iniciar la carga de datos
        controller.initiate();
        
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.println("\n1. Buscar producto por SKU");
            System.out.println("2. Salir");
            System.out.print("Escriba el número de la opción deseada: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("\nIntroduzca el SKU del producto: ");
                    Long SKU = scanner.nextLong();
                    
                    // Buscar el producto
                    List<String> productInfo = controller.searchProduct(SKU);
                    
                    // Mostrar los resultados de la búsqueda
                    if (productInfo.size() > 1) {
                        System.out.println("\nInformación del producto:");
                        System.out.println("Nombre: " + productInfo.get(0));
                        System.out.println("Precio de venta: $" + productInfo.get(1));
                        System.out.println("Precio más bajo (actual): $" + productInfo.get(2));
                        System.out.println("Categoría: " + productInfo.get(3));
                    } else {
                        System.out.println(productInfo.get(0)); // Mensaje de producto no encontrado
                    }
                    break;
                case 2:
                    stop = true;
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción inválida. Inténtelo de nuevo.");
                    break;
            }        
        }
        scanner.close();    
    }
}