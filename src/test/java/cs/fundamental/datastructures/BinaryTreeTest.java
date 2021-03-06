package cs.fundamental.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeTest {

    @Test
    void add() {
        BinaryTree binaryTree = new BinaryTree();
        boolean result = binaryTree.add(5);
        assertTrue(result);
    }

    @Test
    void add2() {
        BinaryTree binaryTree = new BinaryTree();

        for (int i = 0; i < 20; i++) {
            boolean result = binaryTree.add(new Random().nextInt());
            assertTrue(result);
        }
    }

    @Test
    void preOrderTraversal() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(34);
        binaryTree.add(10);
        binaryTree.add(30);
        binaryTree.add(58);
        binaryTree.add(37);
        binaryTree.add(79);
        binaryTree.add(27);
        binaryTree.add(50);
        binaryTree.add(33);

        List<Integer> result = binaryTree.inOrderTraversal();
        Integer[] expected = {10, 27, 30, 33, 34, 37, 50, 58, 79};
        assertArrayEquals(expected, result.toArray());
    }

    @Test
    void inOrderTraversal() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(34);
        binaryTree.add(10);
        binaryTree.add(30);
        binaryTree.add(58);
        binaryTree.add(37);
        binaryTree.add(79);
        binaryTree.add(27);
        binaryTree.add(50);
        binaryTree.add(33);

        Integer[] expected = {34, 10, 30, 27, 33, 58, 37, 50, 79};
        List<Integer> result = binaryTree.preOrderTraversal();
        assertArrayEquals(expected, result.toArray());

    }

    @Test
    void postOrderTraversal() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(34);
        binaryTree.add(10);
        binaryTree.add(30);
        binaryTree.add(58);
        binaryTree.add(37);
        binaryTree.add(79);
        binaryTree.add(27);
        binaryTree.add(50);
        binaryTree.add(33);

        Integer[] expected = {27, 33, 30, 10, 50, 37, 79, 58, 34};
        List<Integer> result = binaryTree.postOrderTraversal();
        assertArrayEquals(expected, result.toArray());
    }

    @Test
    void levelOrder() {

        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(60);
        tree.add(40);
        tree.add(20);
        tree.add(30);
        tree.add(15);
        tree.add(55);
        tree.add(65);
        tree.add(54);
        tree.add(56);
        tree.add(64);
        tree.add(70);
        tree.add(63);

        Integer[] expected = {50, 40, 60, 20, 55, 65, 15, 30, 54, 56, 64, 70, 63};
        List<Integer> result = tree.levelOrder();
        assertArrayEquals(expected, result.toArray());
    }
}