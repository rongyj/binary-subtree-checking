package com.rong.interviews.binarysubtree;

import com.rong.interviews.binarysubtree.model.TreeNode;

/**
 * Created by rongyj on 3/20/17.
 */
public class BinarySubtreeChecker {

    private final static String SPECIAL_EMPTY_CHAR="@";

    private void inOrder(TreeNode root, StringBuffer inOrderBuffer){
        if(root != null) {
            inOrder(root.getLeft(), inOrderBuffer);
            inOrderBuffer.append(root.getValue());
            inOrder(root.getRight(), inOrderBuffer);
        }else{
            inOrderBuffer.append(SPECIAL_EMPTY_CHAR);
        }
    }

    private void preOrder(TreeNode root, StringBuffer preOrderBuffer){
        if(root != null) {
            preOrderBuffer.append(root.getValue());
            preOrder(root.getLeft(), preOrderBuffer);
            preOrder(root.getRight(), preOrderBuffer);
        }else{
            preOrderBuffer=preOrderBuffer.append(SPECIAL_EMPTY_CHAR);
        }
    }

    /**
     * Check to see if a binary tree is a subtree of another binary tree.
     * A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T.
     * @param binaryTree The binary tree will check against to see if the other binary tree is a subtree of this tree
     * @param subTree The binary tree to check if it is a subtree of another binary tree
     * @return
     */

    public boolean checkSubtree(TreeNode binaryTree, TreeNode subTree){
        StringBuffer subTreeInOrderBuffer=new StringBuffer();
        StringBuffer subTreePreOrderBuffer=new StringBuffer();
        inOrder(subTree,subTreeInOrderBuffer);
        preOrder(subTree,subTreePreOrderBuffer);

        StringBuffer binTreeInOrderBuffer=new StringBuffer();
        StringBuffer binTreePreOrderBuffer=new StringBuffer();
        inOrder(binaryTree,binTreeInOrderBuffer);
        preOrder(binaryTree,binTreePreOrderBuffer);

        if(binTreeInOrderBuffer.toString().contains(subTreeInOrderBuffer)
                && binTreePreOrderBuffer.toString().contains(subTreePreOrderBuffer))
            return true;
        return false;
    }
}
