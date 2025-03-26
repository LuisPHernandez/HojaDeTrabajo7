public class ProductNode<E extends Comparable<E>> extends Node<E> {
    // Atributos
    private double priceRetail;
    private double priceCurrent;
    private String Name;
    private String category;

    // Métodos
    public ProductNode(E comparableValue, double priceRetail, double priceCurrent, String Name, String category) {
        super(comparableValue);
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.Name = Name;
        this.category = category;
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}