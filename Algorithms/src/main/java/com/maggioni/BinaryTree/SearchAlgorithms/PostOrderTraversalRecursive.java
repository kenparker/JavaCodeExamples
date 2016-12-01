package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.BinaryTree;
import com.maggioni.BinaryTree.Entities.Node;

public class PostOrderTraversalRecursive extends Traversal{

    public PostOrderTraversalRecursive(BinaryTree binaryTree) {
        super(binaryTree);
    }
      
    @Override
    public String BTTraversal() {
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
