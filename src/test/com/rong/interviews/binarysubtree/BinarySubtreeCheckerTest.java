package com.rong.interviews.binarysubtree;

import com.rong.interviews.binarysubtree.model.TreeNode;
import junit.framework.TestCase;

/**
 * Created by rongyj on 3/20/17.
 */
public class BinarySubtreeCheckerTest extends TestCase {

    /*

        Tree1
          x
        /    \
      a       b
       \
        c

        Tree2
              z
            /   \
          x      e
        /    \     \
      a       b      k
       \
        c


     */

    public void testCheckSubtree(){

        //Build the subtree
        TreeNode subTreeRoot = new TreeNode("x");
        TreeNode nodeA=new TreeNode("a");
        nodeA.setRight(new TreeNode("c"));
        subTreeRoot.setLeft(nodeA);
        subTreeRoot.setRight(new TreeNode("b"));


        //Build the binary tree
        TreeNode a=new TreeNode("a");
        a.setRight(new TreeNode("c"));
        TreeNode e = new TreeNode("e");
        e.setRight(new TreeNode("k"));
        TreeNode x= new TreeNode("x");
        x.setLeft(a);
        x.setRight(new TreeNode("b"));
        TreeNode root = new TreeNode("z");
        root.setRight(e);
        root.setLeft(x);

        BinarySubtreeChecker checker = new BinarySubtreeChecker();
        boolean isSubtree=checker.checkSubtree(root,subTreeRoot);
        assertEquals(true,isSubtree);
    }
/*
    Tree1
          x
        /  \
       a    b
      /
     c


            Tree2
          x
        /   \
      a      b
     /        \
    c         d
    */

    public void testCheckSubtreeWithSameRootNode(){

        //Build the subtree
        TreeNode subTreeRoot = new TreeNode("x");
        TreeNode nodeA=new TreeNode("a");
        nodeA.setRight(new TreeNode("c"));
        subTreeRoot.setLeft(nodeA);
        subTreeRoot.setRight(new TreeNode("b"));


        //Build the binary tree
        TreeNode a=new TreeNode("a");
        a.setRight(new TreeNode("c"));
        TreeNode root= new TreeNode("x");
        root.setLeft(a);
        TreeNode b= new TreeNode("b");
        b.setRight(new TreeNode("d"));
        root.setRight(b);

        BinarySubtreeChecker checker = new BinarySubtreeChecker();
        boolean isSubtree=checker.checkSubtree(root,subTreeRoot);
        assertEquals(false,isSubtree);

    }

    /*

        Tree1
          x
        /    \
      a       b
       \
        c

        Tree2

          x
        /    \
      a       b
       \
        c


     */


    public void testCheckSubtreeWithSameTree(){

        //Build the subtree
        TreeNode subTreeRoot = new TreeNode("x");
        TreeNode nodeA=new TreeNode("a");
        nodeA.setRight(new TreeNode("c"));
        subTreeRoot.setLeft(nodeA);
        subTreeRoot.setRight(new TreeNode("b"));


        //Build the binary tree
        TreeNode a=new TreeNode("a");
        a.setRight(new TreeNode("c"));
        TreeNode root= new TreeNode("x");
        root.setLeft(a);
        TreeNode b= new TreeNode("b");
        root.setRight(b);

        BinarySubtreeChecker checker = new BinarySubtreeChecker();
        boolean isSubtree=checker.checkSubtree(root,subTreeRoot);
        assertEquals(true,isSubtree);

    }

}
