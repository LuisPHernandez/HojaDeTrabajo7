import java.util.List;

public class TreeController {
    // Atributos
    /**
     *
     */
    private String file;
    /**
     *
     */
    private BinarySearchTree<Long> tree;
    
    // Métodos
    /**
     * @param file
     */
    public TreeController(String file) {
        this.file = file;
    }

    /**
     * 
     */
    public void initiate() {
        ProductLoader loader = new ProductLoader();
        this.tree = loader.loadData(this.file);
    }

    /**
     * @param SKU
     * @return
     */
    public List<String> searchProduct(Long SKU) {
        Node<Long> node = this.tree.search(SKU);
        if (node != null && node instanceof ProductNode) {
            ProductNode<Long> productNode = (ProductNode<Long>) node;
            return List.of(
                productNode.getName(),
                String.valueOf(productNode.getPriceRetail()),
                String.valueOf(productNode.getPriceCurrent()),
                productNode.getCategory()
            );
        } else {
            return List.of("Producto no encontrado");
        }
    }
}
