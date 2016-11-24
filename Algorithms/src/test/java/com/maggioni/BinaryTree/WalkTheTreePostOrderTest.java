package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.SearchAlgorithms.PostOrderSearch;
import com.maggioni.BinaryTree.Entities.BinaryTree;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class WalkTheTreePostOrderTest {
      
    //@Ignore
    @Test
    public void walkTheTreeCase1() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase1();

        String walkTree = new PostOrderSearch(tree).walkTreePostOrder();

        assertEquals("A D B root", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase2() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase2();

        String walkTree = new PostOrderSearch(tree).walkTreePostOrder();

        assertEquals("B C A D root", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase3() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase3();

        String walkTree = new PostOrderSearch(tree).walkTreePostOrder();

        assertEquals("A B C D root", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase7() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase7();

        String walkTree = new PostOrderSearch(tree).walkTreePostOrder();

        assertEquals("C B D A E root", walkTree);
    }
}
