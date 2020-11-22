package com.company;

import java.util.Arrays;

/**
 * Created By Steve P. on 11/15/2020
 * original package: com.company
 * ------------------------------------------------------------------------------------------
 */
public class Stack {
    private Node top;
    private int size;

    public Stack() {
        size = 0;
    }

    public Stack(int[] dataArray){
        Arrays.stream(dataArray).forEach(data -> push(data));
        size = dataArray.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    //add int to top of stack
    public void push(int data){
        if(top == null)
            top = new Node(data);
        else
        {
            Node current = new Node(data,top);
            top = current;
        }
        size++;
    }
    //get data from top, but dont remove it
    public int peekTop() {
        return top.getData();
    }
    //remove and get data from top of stack
    public int pop() {
        final int data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }
    //print stack to console, point at top element
    public void print() {
        if(top == null)
            System.out.println("The stack is empty");

        Node current = top;
        System.out.println(current.getData() + " <--");
        current = current.getNext();

        while(current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
