package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.SearchAlgorithms.PreOrderSearch;
import com.maggioni.BinaryTree.Entities.BinaryTree;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class WalkTheTreePreOrderTest {
    
    public WalkTheTreePreOrderTest() {
    }
  
    //@Ignore
    @Test
    public void walkTheTreeCase1() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase1();

        String walkTree = new PreOrderSearch(tree).walkTreePreOrder();

        assertEquals("root A B D", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase2() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase2();

        String walkTree = new PreOrderSearch(tree).walkTreePreOrder();

        assertEquals("root A B C D", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase3() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase3();

        String walkTree = new PreOrderSearch(tree).walkTreePreOrder();

        assertEquals("root A D B C", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase7() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase7();

        String walkTree = new PreOrderSearch(tree).walkTreePreOrder();

        assertEquals("root A D B C E", walkTree);
    }
}
