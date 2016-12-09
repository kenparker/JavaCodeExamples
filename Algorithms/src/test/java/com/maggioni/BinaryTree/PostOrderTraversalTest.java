package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.DataStructures.BinaryTree;
import com.maggioni.BinaryTree.SearchAlgorithms.PostOrderTraversalIterative;
import com.maggioni.BinaryTree.SearchAlgorithms.PostOrderTraversalRecursive;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PostOrderTraversalTest {

    BinaryTree tree;
    String walkTreeTarget;
    String walkTreeRecursive;
    String walkTreeIterative;

    //@Ignore
    @Test
    public void testCase1Traversal() {
        tree = new BinaryTreeTestCases().setupCase1();

        walkTreeTarget = "A D B root";
        runTraversals();

        assertEqualsTraversals();
    }

    //@Ignore
    @Test
    public void testCase2Traversal() {
        tree = new BinaryTreeTestCases().setupCase2();

        walkTreeTarget = "B C A D root";
        runTraversals();

        assertEqualsTraversals();
    }

    //@Ignore
    @Test
    public void testCase3Traversal() {
        tree = new BinaryTreeTestCases().setupCase3();

        walkTreeTarget = "A B C D root";
        runTraversals();

        assertEqualsTraversals();
    }

    //@Ignore
    @Test
    public void testCase7Traversal() {
        tree = new BinaryTreeTestCases().setupCase4();

        walkTreeTarget = "C B D A E root";
        runTraversals();

        assertEqualsTraversals();
    }

    private void runTraversals() {
        walkTreeRecursive = new PostOrderTraversalRecursive(tree).BTTraversal();
        walkTreeIterative = new PostOrderTraversalIterative(tree).BTTraversal();
    }

    private void assertEqualsTraversals() {
        assertEquals(walkTreeTarget, walkTreeRecursive);
        assertEquals(walkTreeTarget, walkTreeIterative);
    }

}
