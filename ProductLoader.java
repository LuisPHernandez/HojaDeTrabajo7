import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader {
    /**
     * 
     */
    public ProductLoader() {}

    /**
     * @param file
     * @return
     */
    public BinarySearchTree<Long> loadData(String file) {
        BinarySearchTree<Long> tree = new BinarySearchTree<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                if (data.length < 19) {
                    continue;
                }

                try {
                    long SKU = Long.parseLong(data[6].trim());
                    
                    double priceRetail = parseDoubleWithDefault(data[9].trim(), 0.0);
                    double priceCurrent = parseDoubleWithDefault(data[10].trim(), 0.0);
                    
                    String productName = data[18].trim().isEmpty() ? "Producto sin nombre" : data[18].trim();
                    String category = data[0].trim().isEmpty() ? "Sin categoría" : data[0].trim();
                    
                    Node<Long> product = new ProductNode<>(SKU, priceRetail, priceCurrent, productName, category);
                    tree.insert(product);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException("Error al cargar el archivo de productos", e);
        }
        return tree;
    }

    /**
     * @param value
     * @param defaultValue
     * @return
     */
    private double parseDoubleWithDefault(String value, double defaultValue) {
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}