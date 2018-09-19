package org.lb.dsa.linkedlist;

public class Node {
    private int data;
    private Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return String.valueOf(data);
    }

    public boolean equals(Node anotherNode) {
        if(anotherNode == null) {
            return false;
        }
        if(anotherNode.getData() == this.data) {
            return true;
        }
        return false;
    }
}
