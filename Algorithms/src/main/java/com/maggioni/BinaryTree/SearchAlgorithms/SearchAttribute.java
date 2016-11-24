package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.Node;

public class SearchAttribute {

    private String walkTheTreeString = "";
    private Node nodeToSearch;
    private boolean nodeFound;
    private boolean walkOrSearch;

    public SearchAttribute() {
    }

    public Node getNodeToSearch() {
        return nodeToSearch;
    }

    public void setNodeToSearch(Node nodeToSearch) {
        this.nodeToSearch = nodeToSearch;
    }

    public boolean isNodeFound() {
        return nodeFound;
    }

    private void setNodeFound(boolean nodeFound) {
        this.nodeFound = nodeFound;
    }

    public void setWalkOrSearch(boolean walkOrSearch) {
        this.walkOrSearch = walkOrSearch;
    }

    public boolean isWalkOrSearch() {
        return walkOrSearch;
    }

    public String getWalkTheTreeString() {
        return walkTheTreeString.trim();
    }
    
    public void addNodeToString(Node node) {
        walkTheTreeString += " " + node.getName();
    }
    
}
