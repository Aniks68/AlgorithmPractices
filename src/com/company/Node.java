package com.company;

public class Node<T> {
    public static void main(String[] args) {
        Node<String> x = new Node<>("Ikechukwu", null);
        Node<String> y = new Node<>("Paul", x);
        Node<String> z = new Node<>("Anene", y);
        System.out.println(z.getNext().getNext().getData() );
        System.out.println( z.getNext().getData() );
        System.out.println( z.getData() );
    }

    private T data;
    private Node next;

    public Node(T d, Node nx) {
        data = d;
        next = nx;
    }

    public T getData() { return data; }
    public Node getNext() { return next; }
    public void setData(T d) { data = d; }
    public void setNext(Node n) { next = n; }
}
