package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.DataStructures.BinaryTree;
import com.maggioni.BinaryTree.SearchAlgorithms.PreOrderTraversalIterative;
import com.maggioni.BinaryTree.SearchAlgorithms.PreOrderTraversalRecursive;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PreOrderTraversalTest {
    
    BinaryTree tree;
    String traversalTreeTarget;
    String traversalTreeRecursive;
    String traversalTreeIterative;
  
    //@Ignore
    @Test
    public void testCase1Traversal() {
        tree = new BinaryTreeTestCases().setupCase1();

        runTraversals();

        traversalTreeTarget = "root A B D";
        assesEqualsTraversals();
    }
  
    //@Ignore
    @Test
    public void testCase2Traversal() {
        tree = new BinaryTreeTestCases().setupCase2();

        runTraversals();

        traversalTreeTarget = "root A B C D";
        assesEqualsTraversals();
    }
    
    //@Ignore
    @Test
    public void testCase3Traversal() {
        tree = new BinaryTreeTestCases().setupCase3();

        runTraversals();

        traversalTreeTarget = "root A D B C";
        assesEqualsTraversals();
    }
    
    //@Ignore
    @Test
    public void testCase4Traversal() {
        tree = new BinaryTreeTestCases().setupCase4();

        runTraversals();

        traversalTreeTarget = "root A D B C E";
        assesEqualsTraversals();
    }

    private void runTraversals() {
        traversalTreeRecursive = new PreOrderTraversalRecursive(tree).BTTraversal();
        traversalTreeIterative = new PreOrderTraversalIterative(tree).BTTraversal();
    }

    private void assesEqualsTraversals() {
        assertEquals(traversalTreeTarget, traversalTreeRecursive);
        assertEquals(traversalTreeTarget, traversalTreeIterative);
    }
}
