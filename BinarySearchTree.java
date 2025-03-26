public class BinarySearchTree<E extends Comparable<E>> {
    // Atributos
    private Node<E> treeRoot;

    // Métodos
    public BinarySearchTree() {
        treeRoot = null;
    }

    public void insert(Node<E> newNode) {
        if (this.treeRoot == null) {
            this.treeRoot = newNode;
        }
        else {
            this.insertRecursive(newNode, treeRoot);
        }  
    }
    
    private void insertRecursive(Node<E> newNode, Node<E> root) {
        if (newNode.compareTo(root) <= 0) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(newNode);
            }
            else {
                this.insertRecursive(newNode, root.getLeftNode());
            }
        }
        else {
            if (root.getRightNode() == null) {
                root.setRightNode(newNode);
            }
            else {
                this.insertRecursive(newNode, root.getRightNode());
            }
        }
    }

    public Node<E> search(E value) {
        if (this.treeRoot == null) {
            return null;
        }
        else if (this.treeRoot.getComparableValue() == value) {
            return this.treeRoot;
        }
        else {
            return this.searchRecursive(value, this.treeRoot);
        }
    }

    private Node<E> searchRecursive(E value, Node<E> root) {
        if (value <= root.getComparableValue()) {
            if (root.getLeftNode().getComparableValue() == value) {
                return root.getLeftNode();
            }
            else {
                return this.searchRecursive(value, root.getLeftNode());
            }
        }
        else {
            if (root.getRightNode().getComparableValue() == value) {
                return root.getRightNode();
            }
            else {
                return this.searchRecursive(value, root.getRightNode());
            }
        }
    }
}
