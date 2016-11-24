package com.maggioni.BinaryTree;

import com.maggioni.BinaryTree.SearchAlgorithms.InOrderSearch;
import com.maggioni.BinaryTree.Entities.BinaryTree;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class WalkTheTreeInOrderTest {
    
    //@Ignore
    @Test
    public void walkTheTreeCase2() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase2();

        String walkTree = new InOrderSearch(tree).walkTreeInOrder();

        assertEquals("B A C root D", walkTree);
    }
    
    //@Ignore
    @Test
    public void walkTheTreeCase3() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase3();

        String walkTree = new InOrderSearch(tree).walkTreeInOrder();

        assertEquals("A root B D C", walkTree);
    }
    
    @Test
    public void walkTheTreeCase7() {
        BinaryTree tree = new BinaryTreeTestCases().setupCase7();

        String walkTree = new InOrderSearch(tree).walkTreeInOrder();

        assertEquals("A B C D root E", walkTree);
    }
}
