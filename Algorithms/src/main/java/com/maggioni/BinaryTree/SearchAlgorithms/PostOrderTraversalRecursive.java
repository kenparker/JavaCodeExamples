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
        return binaryTreeWalkAttribute.getWalkString();
    }
     
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        binaryTreeWalkAttribute.addNodeToString(node);
    }
}
