public class ProductNode<E extends Comparable<E>> extends Node<E> {
    // Atributos
    /**
     *
     */
    private double priceRetail;
    /**
     *
     */
    private double priceCurrent;
    /**
     *
     */
    private String Name;
    /**
     *
     */
    private String category;

    // Métodos
    /**
     * @param comparableValue
     * @param priceRetail
     * @param priceCurrent
     * @param Name
     * @param category
     */
    public ProductNode(E comparableValue, double priceRetail, double priceCurrent, String Name, String category) {
        super(comparableValue);
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.Name = Name;
        this.category = category;
    }

    /**
     * @return
     */
    public double getPriceRetail() {
        return priceRetail;
    }

    /**
     * @param priceRetail
     */
    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    /**
     * @return
     */
    public double getPriceCurrent() {
        return priceCurrent;
    }

    /**
     * @param priceCurrent
     */
    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    /**
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }
}