package javas;

import java.util.ArrayList;
import java.util.List;

class BinarySearchTree {
    private Node root;

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public boolean insert(int value) {
        root = insert(root, value);
        return true;
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (value < node.value) {
            return search(node.left, value);
        } else if (value > node.value) {
            return search(node.right, value);
        } else {
            return true;
        }
    }

    public java.util.List<Integer> traverse() {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private void inOrderTraversal(Node node, java.util.List<Integer> result) {
        if (node != null) {
            inOrderTraversal(node.left, result);
            result.add(node.value);
            inOrderTraversal(node.right, result);
        }
    }
}
