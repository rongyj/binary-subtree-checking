package com.rong.interviews.binarysubtree.model;

/**
 * Created by rongyj on 3/20/17.
 */
public class TreeNode {
    private String value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }
}
