public class Node<E> implements Comparable<Node<E>> {
    // Atributos
    private E comparableValue;
    private Node<E> leftNode;
    private Node<E> rightNode;

    // Métodos
    public Node(E comparableValue) {
        this.comparableValue = comparableValue;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public int compareTo(Node<E> other) {
        return compare(this.comparableValue, other.getComparableValue());
    }

    public int compareValueTo(E comparableValue) {
        return compare(this.comparableValue, comparableValue);
    }

    public E getComparableValue() {
        return this.comparableValue;
    }

    public void setcomparableValue(E comparableValue) {
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