package com.company;


public class LinkedList {
    private Node1 head;
    private Node1 tail;
    int size;

    public Node1 getHead() {
        return head;
    }

    public void setHead(Node1 head) {
        this.head = head;
    }

    public Node1 getTail() {
        return tail;
    }

    public void setTail(Node1 tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(int data) {
        Node1 node = new Node1(data);
        if(head == null) {
            this.setHead(node);
            this.setTail(node);
            size++;
        } else {
            this.getTail().setNextNode(node);
            tail = node;
            size++;
        }
        System.out.println("Node " + node.toString()+ " has been created!");
    }

    public void addHead(int data) {
        Node1 node = new Node1(data);
        if (head != null) {
            Node1 curr = head;
            node.setNextNode(curr);
            this.setHead(node);
            System.out.println("New head of data: " + node + " has been set.");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.addHead(95);
        System.out.println(list);
        System.out.println(list.getHead());
        System.out.println(list.getHead().getData());
    }
}

    class Node1 {
        private Integer data;
        private Node1 nextNode;

        public Node1(Integer data) {
            this.data = data;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node1 getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node1 nextNode) {
            this.nextNode = nextNode;
        }
    }
