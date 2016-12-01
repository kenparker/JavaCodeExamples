package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.Entities.BinaryTree;
import com.maggioni.BinaryTree.SearchAlgorithms.PreOrderTraversalIterative;
import com.maggioni.BinaryTree.SearchAlgorithms.PreOrderTraversalRecursive;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PreOrderTraversalTest {
    
    BinaryTree tree;
    String walkTreeTarget;
    String walkTreeRecursive;
    String walkTreeIterative;
  
    //@Ignore
    @Test
    public void testCase1Traversal() {
        tree = new BinaryTreeTestCases().setupCase1();

        walkTreeTarget = "root A B D";
        runTraversals(tree);

        assesEqualsTraversals();
    }
  
    //@Ignore
    @Test
    public void testCase2Traversal() {
        tree = new BinaryTreeTestCases().setupCase2();

        walkTreeTarget = "root A B C D";
        runTraversals(tree);

        assesEqualsTraversals();
    }
    
    //@Ignore
    @Test
    public void testCase3Traversal() {
        tree = new BinaryTreeTestCases().setupCase3();

        walkTreeTarget = "root A D B C";
        runTraversals(tree);

        assesEqualsTraversals();
    }
    
    //@Ignore
    @Test
    public void testCase7Traversal() {
        tree = new BinaryTreeTestCases().setupCase7();

        walkTreeTarget = "root A D B C E";
        runTraversals(tree);

        assesEqualsTraversals();
    }

    private void runTraversals(BinaryTree tree1) {
        walkTreeRecursive = new PreOrderTraversalRecursive(tree1).BTTraversal();
        walkTreeIterative = new PreOrderTraversalIterative(tree1).BTTraversal();
    }

    private void assesEqualsTraversals() {
        assertEquals(walkTreeTarget, walkTreeRecursive);
        assertEquals(walkTreeTarget, walkTreeIterative);
    }
}
