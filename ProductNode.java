public class ProductNode<E> implements Comparable<ProductNode<E>> {
    // Atributos
    private int SKU;
    private double priceRetail;
    private double priceCurrent;
    private String productName;
    private String category;
    private ProductNode<E> leftNode;
    private ProductNode<E> rightNode;

    // Métodos
    public ProductNode(int SKU, double priceRetail, double priceCurrent, String productName, String category) {
        this.SKU = SKU;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public int compareTo(ProductNode<E> other) {
        return Integer.compare(this.SKU, other.getSKU());
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public double getPriceRetail() {
        return priceRetail;
    }

    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    public double getPriceCurrent() {
        return priceCurrent;
    }

    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductNode<E> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ProductNode<E> leftNode) {
        this.leftNode = leftNode;
    }

    public ProductNode<E> getRightNode() {
        return rightNode;
    }

    public void setRightNode(ProductNode<E> rightNode) {
        this.rightNode = rightNode;
    }
}