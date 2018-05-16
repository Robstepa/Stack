import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void testAdd() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(20);
        binaryTree.add(50);
        binaryTree.add(8);
        binaryTree.add(13);
        binaryTree.traversePreOrder(binaryTree.getRoot());
    }

    @Test
    void contains() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(20);
        binaryTree.add(50);
        binaryTree.add(8);
        binaryTree.add(13);
        assertTrue(binaryTree.contains(8));
    }
}