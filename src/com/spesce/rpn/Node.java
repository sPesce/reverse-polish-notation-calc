package com.spesce.rpn;

/**
 * Created By Steve P. on 11/15/2020
 * original package: com.company
 * ------------------------------------------------------------------------------------------
 */
public class Node {
    private double data;
    private Node next;

    public Node() {
    }

    public Node(double data) {
        this.data = data;
    }

    public Node(double data, Node next) {
        this.data = data;
        this.next = next;
    }

    public double getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
