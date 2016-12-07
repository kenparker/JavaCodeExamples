package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.BinaryTree;

public abstract class Traversal {
    public final BinaryTree binaryTree;
    public final WalkAttribute binaryTreeWalkAttribute = new WalkAttribute();

    public Traversal(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
    }

    public abstract String BTTraversal();
    
}
