package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.DataStructures.BinaryTree;

public abstract class Traversal {
    public final BinaryTree binaryTree;
    public final TraversalAttribute traversalAttribute = new TraversalAttribute();

    public Traversal(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
    }

    public abstract String BTTraversal();
    
}
