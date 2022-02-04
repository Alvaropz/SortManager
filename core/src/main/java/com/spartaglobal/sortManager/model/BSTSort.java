package com.spartaglobal.sortManager.model;
import java.util.ArrayList;
import java.util.HashSet;

// Main logic provided by https://www.baeldung.com/java-binary-tree;
public class BSTSort implements Sort {
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

            HashSet<Integer> inputSet = new HashSet<>();
            for (int i = 0; i  < arr.length; i++){
                if (!inputSet.contains(arr[i])){
                    inputSet.add(arr[i]);
                }
            }
            int[] filteredArray = new int[inputSet.size()];
            int i = 0;
            for (int number : inputSet) {
                filteredArray[i++] = number;
            }

            BinaryTree bt = new BinaryTree();
            for(int j = 0; j < arr.length; j++) {
                bt.add(arr[j]);
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

