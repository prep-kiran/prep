package org.lb.dsa.linkedlist;

public class DLLNode {
    private int data;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode() {

    }

    public DLLNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public DLLNode(int data, DLLNode prev, DLLNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getPrev() {
        return this.prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public DLLNode getNext() {
        return this.next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public String toString() {
        return String.valueOf(data);
    }

    public boolean equals(DLLNode anotherNode) {
        if(anotherNode == null) {
            return false;
        }
        else if(anotherNode.getData() == this.getData()) {
            return true;
        }
        return false;
    }
}
