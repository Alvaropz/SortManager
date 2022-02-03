package com.spartaglobal.sortManager.model;
import java.util.ArrayList;

// Main logic provided by https://www.baeldung.com/java-binary-tree;
class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class BinaryTree {

    Node root;
    ArrayList<Integer> list = new ArrayList<>();

    public BinaryTree createBinaryTree(int[] arr) {
        BinaryTree bt = new BinaryTree();
        for(int i = 0; i < arr.length; i++) {
            bt.add(arr[i]);
        }
        return bt;
    }

    private void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    // Depth-First Search
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            this.list.add(node.value);
            traverseInOrder(node.right);
        }
    }
}

public class BSTSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        BinaryTree btInstance = new BinaryTree();
        BinaryTree btFinal = btInstance.createBinaryTree(arr);
        btFinal.traverseInOrder(btFinal.root);

        int[] arrReturn = new int[btFinal.list.size()];
        for (int i=0; i < arrReturn.length; i++)
        {
            arrReturn[i] = btFinal.list.get(i).intValue();
        }

        return arrReturn;
    }
}

