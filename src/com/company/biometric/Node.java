package com.company.biometric;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    private Node leftChild, rightChild;

    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int height(Node root) {
        if (root == null)
            return -1;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            height++;

            while (size > 0) {
                Node treeNode = queue.remove();

                if (treeNode.leftChild != null)
                    queue.add(treeNode.leftChild);

                if (treeNode.rightChild != null)
                    queue.add(treeNode.rightChild);

                size--;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height(root));
    }
}
