public class ProductNode {
    // Atributos
    int SKU;
    double priceRetail;
    double priceCurrent;
    String productName;
    String category;
    ProductNode leftNode;
    ProductNode rightNode;

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

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int sKU) {
        SKU = sKU;
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

    public ProductNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ProductNode leftNode) {
        this.leftNode = leftNode;
    }

    public ProductNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(ProductNode rightNode) {
        this.rightNode = rightNode;
    }
}