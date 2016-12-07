package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.Node;

public class WalkAttribute {

    private String walkTheTreeString = "";

    public String getWalkString() {
        return walkTheTreeString.trim();
    }
    
    public void addNodeToString(Node node) {
        walkTheTreeString += " " + node.getName();
    }
    
}
