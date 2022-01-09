package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class LinkedList {
    private Node1 head;
    private Node1 tail;
    int size;

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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        System.out.println(list);
        System.out.println(list.getHead());
        System.out.println(list.getHead().getData());
    }
}
    @Data
    class Node1 {
        private Integer data;
        private Node1 nextNode;

        public Node1(Integer data) {
            this.data = data;
        }
    }
