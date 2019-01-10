package code.ashutoshmeher.dsalgo.tree;

public class BinarySearchTree implements Tree{

    /**
     * The root node of the BST
     */
    Node root;

    /** This function searches a key in the BST.
     *
     * @param key to be searched for
     * @return the node containing the seared key
     */
    @Override
    public Node search(int key) {
        return search(key, root);
    }

    private Node search(int key, Node node){
        /*
          If the node is null throw exception that key doesn't exist,
          either the root node itself is null or we have recursively reached the leaf node and did not found the key
        */
        if(node == null){
            throw new IllegalArgumentException("Node doesn't exist");
        }

        /* Return the node when the key is found */
        if(key == node.value)
            return node;

        /*
          If key is greater than the current node value, it must be present in the right side of the bst.
          Search recursively in the right side in this case.
        */
        if(key > node.value){
            return search(key, node.right);
        /*
          If key is smaller than the current node value, it must be present in the left side of the bst.
          Search recursively in the left side in this case.
         */
        }else {
            return search(key, node.left);
        }
    }

    /**
     *  This function inserts a key to the BST.
     *  Note that the new node in a BST is always inserted at the leaf.
     *  The implementation is similar to search in the BST, we search till we find the correct leaf node where it should be inserted.
     *  The idea is the traverse to the correct position and insert the node at the leaf.
     *
     * @param key to be inserted
     */
    @Override
    public void insert(int key) {
        root = insert(key, root);
    }

    private Node insert(int key, Node node){
        /*
          If the node is empty create a new node to be inserted, Two cases this may happen
          1. The root node itself is null.
          2. We have reached the leaf node of the BST searching recursively.
        */
        if(node == null){
            node = new Node(key);
        }

        /*
            Recursively search the position where to insert the node. Each recursive node returns the current nodes left/ right child.
            When the correct position is found a new node is created and returned, which is then assigned to left/ right of its parent.
        */
        if(key>node.value){
            node.right = insert(key, node.right);
        }else if(key< node.value){
            node.left = insert(key, node.left);
        }

        return node;
    }

    @Override
    public void delete(int key) {
        delete(key, root);
    }

    private Node delete(int key, Node node){
        if(node == null){
            throw new IllegalArgumentException("Node doesn't exist");
        }

        if(key > node.value){
            node.right = delete(key, node);
        }else if(key < node.value){
            node.left = delete(key, node);
        }else{
            /*
            Leaf Node Condition.
            This condition is not required, the one child condition, implicitly takes care of this.
            */
            /*
            if(node.left == null && node.right == null){
                return null;
            } else
            */

            /* One child case */
            if(node.right == null){
                return node.left;
            }else if(node.left == null){
                return node.right;
            }
            /* Two child case */
            else{
                node.value = min(node.right);
                node.right = delete(node.value, node.right);
            }
        }
        return node;
    }

    private int min(Node node){

        while(node.left !=null){
            node = node.left;
        }
        return node.value;

    }

}
