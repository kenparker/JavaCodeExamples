package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.DataStructures.BinaryTree;
import com.maggioni.BinaryTree.DataStructures.Node;

public class PostOrderTraversalRecursive extends Traversal{

    public PostOrderTraversalRecursive(BinaryTree binaryTree) {
        super(binaryTree);
    }
      
    @Override
    public String BTTraversal() {
        postOrder(binaryTree.getRoot());
        return traversalAttribute.getTraversalString();
    }
     
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        traversalAttribute.addNodeToString(node);
    }
}
