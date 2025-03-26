public class BinarySearchTree<E extends Comparable<E>> {
    // Atributos
    private Node<E> treeRoot;

    // Métodos
    public BinarySearchTree() {
        treeRoot = null;
    }

    public void insert(Node<E> newNode) {
        this.insertRecursive(newNode, treeRoot); 
    }
    
    private void insertRecursive(Node<E> newNode, Node<E> root) {
        if (root == null) {
            treeRoot = newNode;
        }
        else if (newNode.compareTo(root) <= 0) {
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
        return this.searchRecursive(treeRoot, value);
    }

    private Node<E> searchRecursive(Node<E> current, E value) {
        if (current == null) {
            return null;
        }

        int compareResult = value.compareTo(current.getComparableValue());

        if (compareResult == 0) {
            return current;
        } 
        else if (compareResult < 0) {
            return searchRecursive(current.getLeftNode(), value);
        } 
        else {
            return searchRecursive(current.getRightNode(), value);
        }
    }

}
