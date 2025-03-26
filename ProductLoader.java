import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader<E> {
    public void loadData(String file) {
        BinarySearchTree<E> tree = new BinarySearchTree<E>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int SKU = Integer.parseInt(data[6].trim());
                double priceRetail = Double.parseDouble(data[9].trim());
                double priceCurrent = Double.parseDouble(data[10].trim());
                String productName = data[18].trim();
                String category = data[1].trim();
                
                ProductNode<E> product = new ProductNode<E>(SKU, priceRetail, priceCurrent, productName, category);
                tree.insert(product);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
