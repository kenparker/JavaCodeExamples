package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.Node;
import com.maggioni.BinaryTree.Entities.BinaryTree;

public class PostOrderSearch {
    
    final private BinaryTree binaryTree;
    private SearchAttribute binaryTreeSearchAttribute = new SearchAttribute();

    public PostOrderSearch(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
        binaryTreeSearchAttribute.setWalkOrSearch(true);
    }
    
    public String walkTreePostOrder() {
        postOrder(binaryTree.getRoot());
        return binaryTreeSearchAttribute.getWalkTheTreeString();
    }
     
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        binaryTreeSearchAttribute.addNodeToString(node);
    }
    
    
    
}
