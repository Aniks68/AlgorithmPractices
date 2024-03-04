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

//    Given the segment structure of a process as a linked list, find the longest sub-list that has the segment sizes in a non-increasing order. A sub-list of length 1 is considered non-increasing.
//    If there are multiple sub-lists of maximum length, return  the sublist that occurs earliest.
//    The data of a node is the size of the segment.

    public String locateLongestSubListOfNonDecreasingData(Node1 head) {
        Node1 curr = head;
        Node1 prev = null;
        int max = 0;
        int count = 0;
        Node1 start = null;
        Node1 end = null;
        while (curr != null) {
            if (prev == null || prev.getData() >= curr.getData()) {
                count++;
                if (count == 1) {
                    start = prev;
                }
                end = curr;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            prev = curr;
            curr = curr.getNextNode();
        }
        getLengthOfSubList(start, end);
        return "Start: " + start + "\n" + " End: " + end;
    }

    private int getLengthOfSubList(Node1 start, Node1 end) {
        System.out.println("Start: " + start + " End: " + end);
        int count = 0;
        while (start != null && start != end.getNextNode()) {
            count++;
            start = start.getNextNode();
        }
        System.out.println("Length of sub list: " + count);
        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.add(2);
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(5);
        list.addHead(2);
//        System.out.println(list);
//        System.out.println(list.getHead());
//        System.out.println(list.getHead().getData());
        System.out.println(list.locateLongestSubListOfNonDecreasingData(list.getHead()));
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

        @Override
        public String toString() {
            return "Node1{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }
