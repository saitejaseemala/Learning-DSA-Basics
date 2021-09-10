package com.datastructure.binarytree;

public class BinaryTree {

    Node root;

    public BinaryTree(int item) {

        root = new Node(item);
    }

    public BinaryTree() {

        root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.println(tree);
    }
}
