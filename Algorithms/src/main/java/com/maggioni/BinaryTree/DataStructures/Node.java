package com.maggioni.BinaryTree.DataStructures;

import java.util.Objects;

public class Node {

    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    
    public Node(String name, Node left, Node right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public boolean isLeafNode() {
        return left == null && right != null;
    }
    
    public boolean isEndNode() {
        return left == null && right == null;
    }
    
    public boolean isNodeLeftEmpty() {
        return left == null;
    }
    
    public boolean isNodeRightEmpty() {
        return right == null;
    }
    
    public String getName() {
        return name;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
   
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public boolean isParent(Node previous) {
        return (previous.equals(this) || 
                (previous.getLeft() != null && previous.getLeft().equals(this)) || 
                (previous.getRight() != null && previous.getRight().equals(this)));
    }

}
