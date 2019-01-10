package code.ashutoshmeher.dsalgo.tree;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree binarySearchTree;

    @Before
    public void setup(){
        binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(25);
        binarySearchTree.insert(15);
        binarySearchTree.insert(50);
        binarySearchTree.insert(10);
        binarySearchTree.insert(4);
        binarySearchTree.insert(12);
        binarySearchTree.insert(22);
        binarySearchTree.insert(18);
        binarySearchTree.insert(24);
        binarySearchTree.insert(50);
        binarySearchTree.insert(35);
        binarySearchTree.insert(70);
        binarySearchTree.insert(31);
        binarySearchTree.insert(44);
        binarySearchTree.insert(66);
        binarySearchTree.insert(90);
    }

    @Test
    public void testPreOrderTraversal(){
        binarySearchTree.preOrderTraversal();
        System.out.println();
    }

    @Test
    public void testInOrderTraversal(){
        binarySearchTree.inOrderTraversal();
        System.out.println();
    }

    @Test
    public void testPostOrderTraversal(){
        binarySearchTree.postOrderTraversal();
        System.out.println();
    }
}
