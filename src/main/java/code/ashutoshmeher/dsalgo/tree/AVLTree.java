package code.ashutoshmeher.dsalgo.tree;

public class AVLTree extends BinarySearchTree implements BinaryTree{

    @Override
    public void insert(int key) {
        insert(key, root);
    }

    private Node insert(int key, Node node){
        if(node == null){
            node = new Node(key);
        }
        if(key > node.value){
            node.right = insert(key, node.right);
        }else if(key < node.value){
            node.left = insert(key, node.left);
        }else{
            return node;
        }

        if(balanceFactor(node) < -1 && key > node.right.value){
            node = leftRotate(node);
        }else if(balanceFactor(node) < -1 && key < node.right.value){
            node.left = rightRotate(node.left);
            node = leftRotate(node);
        }else if(balanceFactor(node) > 1 && key > node.left.value){
            node.right = rightRotate(node.right);
            node = rightRotate(node);
        }else if(balanceFactor(node) > 1 && key < node.left.value){
            node = rightRotate(node);
        }

        return node;
    }

    private Node leftRotate(Node node){
        return node;
    }

    private Node rightRotate(Node node){
        Node temp = node.left;
        node.left = node.left.right;
        temp.right = node;
        return temp;
    }

    private int balanceFactor(Node node){
        return height(node.left) - height(node.right);
    }

    private int height(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(1 + height(node.left), 1 + height(node.right));
    }
}