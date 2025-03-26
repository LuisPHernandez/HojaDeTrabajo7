public class Node<E extends Comparable<E>> implements Comparable<Node<E>> {
    // Attributes
    /**
     *
     */
    private E comparableValue;
    /**
     *
     */
    private Node<E> leftNode;
    /**
     *
     */
    private Node<E> rightNode;

    // Constructor
    /**
     * @param comparableValue
     */
    public Node(E comparableValue) {
        this.comparableValue = comparableValue;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public int compareTo(Node<E> other) {
        return this.comparableValue.compareTo(other.getComparableValue());
    }

    /**
     * @param comparableValue
     * @return
     */
    public int compareValueTo(E comparableValue) {
        return this.comparableValue.compareTo(comparableValue);
    }

    /**
     * @return
     */
    public E getComparableValue() {
        return this.comparableValue;
    }

    /**
     * @param comparableValue
     */
    public void setComparableValue(E comparableValue) {
        this.comparableValue = comparableValue;
    }

    /**
     * @return
     */
    public Node<E> getLeftNode() {
        return leftNode;
    }

    /**
     * @param leftNode
     */
    public void setLeftNode(Node<E> leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * @return
     */
    public Node<E> getRightNode() {
        return rightNode;
    }

    /**
     * @param rightNode
     */
    public void setRightNode(Node<E> rightNode) {
        this.rightNode = rightNode;
    }
}