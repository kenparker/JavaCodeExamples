package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.DataStructures.Node;
import com.maggioni.BinaryTree.DataStructures.BinaryTree;

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
        /*
         * root
         * ├── B
         * │   ├── D
         * │   └── Null
         * └── A
         */
        B.setRight(D);
        root.setLeft(A);
        root.setRight(B);
        return tree;
    }

    public BinaryTree setupCase2() {
        /*
         * root
         * ├── D
         * └── A
         *       ├── C
         *       └── B      
         */
        root.setLeft(A);
        root.setRight(D);
        A.setLeft(B);
        A.setRight(C);
        return tree;
    }

    public BinaryTree setupCase3() {
        /*
         * root
         * ├── D
         * │    ├── C
         * │    └── B   
         * └── A 
         */
        root.setLeft(A);
        root.setRight(D);
        D.setLeft(B);
        D.setRight(C);
        return tree;
    }

    public BinaryTree setupCase4() {
        /*
         * root
         * ├── E
         * └── A
         *      ├── D
         *      │    ├── Null
         *      │    └── B
         *      │         ├── C
         *      │         └── Null
         *      └── Null  
         */
        root.setLeft(A);
        root.setRight(E);
        A.setRight(D);
        D.setLeft(B);
        B.setRight(C);
        return tree;
    }
}
