public class Node<E extends Comparable<E>> implements Comparable<Node<E>> {
    // Attributes
    private E comparableValue;
    private Node<E> leftNode;
    private Node<E> rightNode;

    // Constructor
    public Node(E comparableValue) {
        this.comparableValue = comparableValue;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public int compareTo(Node<E> other) {
        return this.comparableValue.compareTo(other.getComparableValue());
    }

    public int compareValueTo(E comparableValue) {
        return this.comparableValue.compareTo(comparableValue);
    }

    public E getComparableValue() {
        return this.comparableValue;
    }

    public void setComparableValue(E comparableValue) {
        this.comparableValue = comparableValue;
    }

    public Node<E> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<E> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<E> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<E> rightNode) {
        this.rightNode = rightNode;
    }
}