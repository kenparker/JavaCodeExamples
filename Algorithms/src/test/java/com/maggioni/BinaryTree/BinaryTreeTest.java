package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.Entities.Node;
import com.maggioni.BinaryTree.Entities.BinaryTree;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BinaryTreeTest {

    BinaryTree tree = new BinaryTree();
    Node A;
    Node B;
    Node C;
    Node D;
    Node root;

    @Before
    public void setup() {
        A = new Node("A");
        B = new Node("B");
        C = new Node("C");
        D = new Node("D");
        root = new Node("root");
        tree.setRoot(root);
    }

    @Test
    public void addOneNodeToTheTreeTest() {
        assertTrue(tree.find(root));
    }

    @Test
    public void addTwoNodesToTheTreeTest() {
        setupCase5();

        assertTrue(tree.find(root));
        assertTrue(tree.find(A));

    }

    @Test
    public void addTreeNodesToTheTreeTest() {
        setupCase4();

        assertTrue(tree.find(A));
        assertTrue(tree.find(B));
    }

    @Test
    public void addFourNodesToTheTreeTest1() {
        setupCase6();
        
        assertTrue(tree.find(A));
        assertTrue(tree.find(B));
        assertTrue(tree.find(C));
    }

    @Test
    public void addFourNodesToTheTreeTest2() {
        final BinaryTreeTestCases testCase1 = new BinaryTreeTestCases();
        BinaryTree tree = testCase1.setupCase1();

        assertTrue(tree.find(testCase1.A));
        assertTrue(tree.find(testCase1.B));
        assertTrue(tree.find(testCase1.D));
    }
    
    private void setupCase4() {
        root.setLeft(A);
        root.setRight(B);
    }
    
    private void setupCase5() {
        root.setLeft(A);
    }

    private void setupCase6() {
        B.setLeft(C);
        setupCase4();
    }
}
