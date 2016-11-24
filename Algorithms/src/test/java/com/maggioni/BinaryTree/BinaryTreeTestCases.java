package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.Entities.Node;
import com.maggioni.BinaryTree.Entities.BinaryTree;

public class BinaryTreeTestCases {

    BinaryTree tree = new BinaryTree();
    Node A;
    Node B;
    Node C;
    Node D;
    Node E;
    Node root;

    public BinaryTreeTestCases() {
        A = new Node("A");
        B = new Node("B");
        C = new Node("C");
        D = new Node("D");
        E = new Node("E");
        root = new Node("root");
        tree.setRoot(root);
    }

    public BinaryTree setupCase1() {
        B.setRight(D);
        setupCase4();
        return tree;
    }
    
    public BinaryTree setupCase2() {
        root.setLeft(A);
        root.setRight(D);
        A.setLeft(B);
        A.setRight(C);
        return tree;
    }
    
    public BinaryTree setupCase3() {
        root.setLeft(A);
        root.setRight(D);
        D.setLeft(B);
        D.setRight(C);
        return tree;
    }
    
    public BinaryTree setupCase4() {
        root.setLeft(A);
        root.setRight(B);
        return tree;
    }

    public BinaryTree setupCase6() {
        B.setLeft(C);
        setupCase4();
        return tree;
    }
    
    public BinaryTree setupCase7() {
        root.setLeft(A);
        root.setRight(E);
        A.setRight(D);
        D.setLeft(B);
        B.setRight(C);
        return tree;
    }
}
