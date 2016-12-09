package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.DataStructures.Node;

public class TraversalAttribute {

    private String traversalString = "";

    public String getTraversalString() {
        return traversalString.trim();
    }
    
    public void addNodeToString(Node node) {
        traversalString += " " + node.getName();
    }
    
}
